package com.moqi.practice

import spock.lang.Specification

/**
 * 测试替换异常信息文字
 *
 * @author moqi* On 2021/5/22 21:23
 */
class ReplaceExceptionMessageTest extends Specification {

    def "test handle parameter"() {
        expect:
        ReplaceExceptionMessage.handleParameter(source) == result

        where:
        source                                                                                           | result
        "listByTwoNames.namespaceName: must not be blank, listByTwoNames.serviceName: must not be blank" | "namespaceName: must not be blank, serviceName: must not be blank"
    }

    def "test handle po parameter"() {
        expect:
        ReplaceExceptionMessage.handlePoParameter(source) == result

        where:
        source                                                                                                 | result
        "addEnv.onlyFunctionPo.namespaceName: size must be between 4 and 32, addEnv.po.key: must not be blank" | "namespaceName: size must be between 4 and 32, key: must not be blank"
    }

    def "test handle po list parameter"() {
        expect:
        ReplaceExceptionMessage.handlePoListParameter(source) == result

        where:
        source                                                                                                               | result
        "batchAddPort.poPortList[1].extension: Must be json string, batchAddPort.poPortList[1].another: Must be json string" | "[1].extension: Must be json string, [1].another: Must be json string"
    }

}
