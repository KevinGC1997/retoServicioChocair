Feature: consumir endpoints

  @GETS
  Scenario Outline: Obtener todos los empleado
    Given brandon envia el siguiente endpoint <url>
    When valida que el contenido de la llave "status" sea "success"
    Then Brandon valida que el codigo de status sea 200
    Examples:
      | url                                               |
      | https://dummy.restapiexample.com/api/v1/employees |

  @GET
  Scenario Outline:Obtener un empleado
    Given brandon envia el siguiente informacion <url>
    When  valida que el contenido de la llave "status" sea "success"
    Then  Brandon valida que el codigo de status sea 200
    Examples:
      | url                                                |
      | https://dummy.restapiexample.com/api/v1/employee/1 |

  @POST
  Scenario Outline: : Crea un nuevo empleado
    Given brandon envia el siguiente endpointPost "https://dummy.restapiexample.com/api/v1/create"
      | name   | <name>   |
      | salary | <salary> |
      | test   | <age>    |
    When valida que el contenido de la llave "status" sea "success"
    Then Brandon valida que el codigo de status sea 200
    Examples:
      | name | salary | age |
      | test | 123    | 23  |

  @PUT
  Scenario Outline: Actualiza un empleado
    Given brandon envia el siguiente informacionPUT <url>
      | name   | <name>   |
      | salary | <salary> |
      | age    | <age>    |
    When valida que el contenido de la llave "status" sea "success"
    Then Brandon valida que el codigo de status sea 200
    Examples:
      | url                                               | name | salary | age |
      | https://dummy.restapiexample.com/api/v1/update/21 | test | 123    | 23  |

  @DELETE
  Scenario Outline: Eliminar empleado
    Given Brandon envia la siguiente informacion <url>
    When valida que el contenido de la llave "status" sea "success"
    Then Brandon valida que el codigo de status sea 200
    Examples:
      | url                                              |
      | https://dummy.restapiexample.com/api/v1/delete/2 |
