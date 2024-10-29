Feature: Gestion de productos de la categoria Agradecimientos
  As a usuario de la tienda online
  I want to ver y añadir productos de la categoria Agradecimientos
  So that puedo completar mi proceso de compra

  Scenario: Ver productos de la categoria Agradecimientos
    Given Ivan estoy en la pagina principal de la tienda
    When selecciono la categoria Agradecimientos
    Then Ivan deberia ver los productos de la categoria Agradecimientos

  Scenario: Añadir dos productos de la categoria Agradecimientos al carrito de compras
    Given Ivan esta en la categoria Agradecimientos
    When Ivan agrega dos productos al carrito
    Then los productos se agregaran al carrito de compras

Scenario: Validar que los productos se muestran correctamente en la opción Carro
  Given que he agregado los productos de la categoría "Agradecimientos" al carrito
  When de clic en la opción “CARRO”
  Then se deberán visualizar los productos agregados