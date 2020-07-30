package com.miquido.javaforqa.week05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreetingServiceTest {

  GreetingService subject;

  @Mock
  LocalizationService localizationService = Mockito.mock(LocalizationService.class);

  @BeforeEach
  void setUp() {
    Mockito.when(localizationService.getTemplate()).thenReturn("Hola");
    // Mockito.when(localizationService.getTemplate()).thenThrow(ArithmeticException.class);
    subject = new GreetingService(localizationService);
  }

  @Test
  void shouldReturnGreetings() {
    assertEquals("Hola Jacek!", subject.sayHello("Jacek"));
    Mockito.verify(localizationService).getTemplate();
  }
}