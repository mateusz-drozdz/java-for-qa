package com.miquido.javaforqa.week05

import spock.lang.Specification

class GreetingServiceSpec extends Specification {

  GreetingService subject


  def 'should return greetings'() {
    given:
    def localizationService = Mock(LocalizationService.class)
    localizationService.getTemplate() >> "Hola"
    subject = new GreetingService(localizationService)

    when:
    subject.sayHello("foo") == "Hola foo!"

    then:
    1 * localizationService.getFoo()
  }

}
