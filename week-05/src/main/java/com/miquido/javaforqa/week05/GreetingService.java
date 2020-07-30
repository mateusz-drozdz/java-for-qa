package com.miquido.javaforqa.week05;

public class GreetingService {

  private final LocalizationService localizationService;

  public GreetingService(LocalizationService localizationService) {
    this.localizationService = localizationService;
  }

  public String sayHello(String name) {
    System.out.println(localizationService.getFoo());
    return localizationService.getTemplate() + " " + name + "!";
    // return "Hola Jacek!";
  }
}
