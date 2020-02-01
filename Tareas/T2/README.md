##Moneda Virtual
###Clase, Especificacion informal
***Moneda***
*Atributos*
- Duenio
- Cantidad
-ListaMonedas
- NombreMoneda= "Astros"
*Operaciones*
-CrearMoneda()
  - Crea una moneda vacia, sin duenio, el unico atributo que se llena automaticamente es el nombre de la moneda.
-AgregarDuenio(cantidad, nombreDuenio)
  - Este metodo crea un duenio de la moneda a la cual se hace el primer contacto, en esta se guarda el nombre del duenio, y la cantidad de monedas.
-RealizarTransferencia(vendedor, comprador, cantidad)
  - Este metodo se utiliza para realizar una trasferencia entre dos duenios, y a la cual se le envia cierta cantidad de monedas.
-RalizarTransferenciaFrom(vendedor, comprador)
  - Este metodo se realiza para cuando un vendedor quiere vender todas sus monedas, y se las da al comprador completamente todas.
-Imprimir()
  -Este metodo imprime la lista de monedas con sus respectivos duenios.
