package domain

import java.util.Date

import org.joda.time.DateTime
import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/19.
  */
case class TextMessage(textID: String,
                       service: List[String],
                       cutoffDate: Date,
                       timeFrom: DateTime,
                       timeTo: DateTime,
                       areaName: List[String])

object TextMessage{
  implicit val textMessageFmt = Json.format[TextMessage]
}
