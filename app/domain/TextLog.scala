package domain

import java.util.Date

import org.joda.time.DateTime
import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/22.
  */
case class TextLog(dateSent: Date,
                   timeSent: DateTime,
                   userID: String,
                   status: String,
                   textID: String)

object TextLog{
 implicit val textLogFmt = Json.format[TextLog]
}
