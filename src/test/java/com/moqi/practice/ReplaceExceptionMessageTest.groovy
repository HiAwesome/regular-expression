package com.moqi.practice

import spock.lang.Specification

/**
 * 测试替换异常信息文字
 *
 * @author moqi* On 2021/5/22 21:23
 */
class ReplaceExceptionMessageTest extends Specification {

    def "test handle parameter"() {
        when:
        def source = "listByTwoNames.namespaceName: must not be blank, listByTwoNames.serviceName: must not be blank"


        then:
        ReplaceExceptionMessage.handleParameter(source) == "namespaceName: must not be blank, serviceName: must not be blank"
    }

    def "test handle po parameter"() {
        when:
        def source = "addEnv.onlyFunctionPo.namespaceName: size must be between 4 and 32, addEnv.po.key: must not be blank"


        then:
        ReplaceExceptionMessage.handlePoParameter(source) == "namespaceName: size must be between 4 and 32, key: must not be blank"
    }

    def "test handle po list parameter"() {
        when:
        def source = "batchAddPort.poPortList[1].extension: Must be json string, batchAddPort.poPortList[1].another: Must be json string"


        then:
        ReplaceExceptionMessage.handlePoListParameter(source) == "[1].extension: Must be json string, [1].another: Must be json string"
    }

    def "test all parameter"() {
        when:
        def source = "listByTwoNames.namespaceName: must not be blank, listByTwoNames.serviceName: must not be blank, addEnv.onlyFunctionPo.namespaceName: size must be between 4 and 32, addEnv.po.key: must not be blank, batchAddPort.poPortList[1].extension: Must be json string, batchAddPort.poPortList[1].another: Must be json string"

        then:
        ReplaceExceptionMessage.handleAllParameter(source) == "namespaceName: must not be blank, serviceName: must not be blank, namespaceName: size must be between 4 and 32, key: must not be blank, [1].extension: Must be json string, [1].another: Must be json string"
    }

}
