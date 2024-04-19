
## Sistema de Automotora
Este es un software diseñado para una automotora que permite gestionar los vehículos disponibles para la venta y la información de los clientes. El sistema proporciona funcionalidades para agregar clientes, agregar vehículos y buscar vehículos según diferentes criterios.

### Funcionalidades Principales
#### El sistema ofrece las siguientes funcionalidades principales:

* Agregar Clientes: Permite agregar información de nuevos clientes, incluyendo su nombre, dirección, número telefónico, correo electrónico y rut. Se realizan validaciones para garantizar la integridad de los datos ingresados, como la verificación del formato del correo electrónico y la validez del rut.
* Agregar Vehículos: Permite agregar información de nuevos vehículos disponibles para la venta, incluyendo su nombre, año, precio, kilómetros recorridos, color y marca. También se realizan validaciones para asegurar la integridad de los datos ingresados.
* Buscar Vehículos: Permite buscar vehículos según diferentes criterios, proporcionando una manera rápida y eficiente de encontrar los vehículos disponibles en las diferentes sedes de la automotora.
* Clases Principales del Sistema
### El sistema está compuesto por los siguientes Packages y Clases principales:


* modelo: Contiene las clases relacionadas con el modelo de datos, como Automotora, Cliente, ColorVehiculo, MarcaVehiculo, Sede y Vehiculo.
* Ventana: Contiene las clases que representan las interfaces gráficas del sistema, como VentanaBuscarVehiculo, VentanaMenuBienvenida, VentanaRegistrarCliente, VentanaRegistrarVehiculo y VentanaTabla.
* utils: Contiene clases de utilidades para validar correo electrónico y rut, como ValidadorCorreo y ValidadorRut.
* principal: Contiene la clase principal del programa, Main, que inicia la aplicación.
### Validaciones
Se realizan validaciones en las interfaces gráficas para garantizar la integridad de los datos ingresados. Esto incluye la verificación del formato del correo electrónico y la validez del rut.

### Interfaz Gráfica
Se ha implementado una interfaz gráfica que cumple con los requisitos mínimos, incluyendo una ventana tipo "Menú principal" y ventanas específicas para cada funcionalidad. Cada ventana incluye las validaciones necesarias para asegurar que los datos ingresados sean correctos.

### Diagrama de Clases UML
![Automotora UML.png](Automotora%20UML.png)
### Pruebas de Funcionamiento
[Caputuras Funcionalidad](Caputuras%20Funcionalidad)