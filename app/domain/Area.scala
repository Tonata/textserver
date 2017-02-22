package domain

import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/19.
  */
case class Area (areaID: String,
                 name: String,
                 areaCode: String)

object Area{
 implicit val areaFmt = Json.format[Area]
}
