Feature: comprar un alicate
  quiero comprar un alicate y validar su precio
 @taga
  Scenario: nombre del escenario
    Given Abrir navegador con la siguiente URL "https://www.sodimac.cl/"
    And Esperar "3" segundos
    When Buscar botón "MantenerUbicacion" y presionarlo
    And Escribir "Alicate" en el campo "BuscarInput"
    And Buscar botón "Lupa" y presionarlo
    And Buscar botón "AlicateObjeto1" y presionarlo
    And El producto tiene "Caimán curvo 10" como nombre en xpath "NombreObjeto"
   Then Close Browser
 @taga
  Scenario: nombre del escenario 2
    Given Abrir navegador con la siguiente URL "https://www.sodimac.cl/"
    And Esperar "3" segundos
    When Buscar botón "MantenerUbicacion" y presionarlo
    And Escribir "Alicate" en el campo "BuscarInput"
    And Buscar botón "Lupa" y presionarlo
    And Buscar botón "AlicateObjeto2" y presionarlo
    And El producto tiene "Alicate picoloro deluxe 8" como nombre en xpath "NombreObjeto"
    Then Close Browser
  @tag
  Scenario Outline: nombre del escenario 2
    Given Abrir navegador con la siguiente URL "https://www.sodimac.cl/"
    And Esperar "3" segundos
    When Buscar botón "MantenerUbicacion" y presionarlo
    And Escribir "Alicate" en el campo "BuscarInput"
    And Buscar botón "Lupa" y presionarlo
    And Buscar botón "<nombreBoton>" y presionarlo
    And El producto tiene "<nombreProducto>" como nombre en xpath "NombreObjeto"
    Then Close Browser
    Examples:
    |nombreBoton|nombreProducto|
    |          AlicateObjeto1 |  Caimán curvo 10            |
    | AlicateObjeto2          |Alicate picoloro deluxe 8              |
