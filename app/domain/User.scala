package domain

import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/19.
  */
case class User(userID: String,
                username: String,
                password: String,
                personID: String)

object User{
 implicit val userFmt = Json.format[User]
}
