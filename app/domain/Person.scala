package domain

import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/22.
  */
case class Person(firstName: String,
                  lastName: String,
                  gender: String,
                  id: String)

object Person{
  implicit val personFmt = Json.format[Person]
}
