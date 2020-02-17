Feature: Everything around the Register of the site

  @Register
  Scenario Outline: Register form verify messages
    Given we visit the <url>
    And we click on the link button <linkButton>
    When we fill the field Name or The business social reason <name>
    And we fill the field Cedula or Nit <id>
    And we select the Country of residence <country>
    And we select the Perfil <perfil>
    And we fill the field Email <email> and the field Password <password>
    And We accept Terms and Conditions
    And We click on the button Create Account <creteAccount>
    Then We receive an alert <message>
    Examples:
      | url                         | linkButton   | name           | id           | country    | perfil        |email                  | password   | creteAccount     |message                                                        |
      | "https://test.ormigga.com/" | "REGÍSTRATE" | "Test Company" | "1040845412" | "Colombia" | "CONTRATANTE" | "t@ormigga.com"  | "12345678" |  "Crear Cuenta"  |"Estás a un clic de activar tu cuenta. Ingresa a tu correo"|
      #| "https://test.ormigga.com/" | "REGÍSTRATE" | "Test Company" | "1040845412" | "Colombia" | "CONTRATANTE" | "efrain@ormigga.com"  | "12345678" |  "Crear Cuenta"  |"El correo o la contraseña no es válida, intenta nuevamente..."|
