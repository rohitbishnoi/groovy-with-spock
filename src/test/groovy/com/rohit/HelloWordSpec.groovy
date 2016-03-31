package com.rohit

import spock.lang.Specification


class HelloWordSpec extends Specification {

    def "it must greet user"() {
        expect:
        new HelloWord().sayHello("john") == "Hello john"

    }
}
