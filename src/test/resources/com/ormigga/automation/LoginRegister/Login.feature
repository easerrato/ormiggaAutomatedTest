Feature: Everything around the login of the site

  @login
  Scenario Outline: Login Form verify messages
    Given we visit the <url>
    And we put this credentials <email> and password <password>
    Then we receive a message containing an <message>
    Examples:
      | url                         | email                 | password   | message                                                        |
      | "https://test.ormigga.com/" | "efrain@ormigga.com"  | "12345678" | "El correo o la contraseña no es válida, intenta nuevamente..."|
      | "https://test.ormigga.com/" | "dicubides@falabella.com.co"  | "1234" | "TAREAS QUE REQUIEREN TU ATENCIÓN"|

  #@login
  #Scenario: correct credentials in the login form
   # Given we visit the "https://test.ormigga.com/"
    #And we put this credentials "dicubides@falabella.com.co" and password "1234"
    #Then we receive a message containing an "alert"
    #And we the login screen appears again
