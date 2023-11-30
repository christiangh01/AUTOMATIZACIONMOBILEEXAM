Feature: Búsqueda en Airbnb

  @test
  Scenario: Búsqueda  hospedaje por nombre

    Given que me encuentro en el login de Airbnb
    And presiono Where to
    And realizo la siguiente busqueda "Vichayito"
    And selecciono Skip
    And presiono el boton Search
    Then muestra el texto "Over 1,000 places"