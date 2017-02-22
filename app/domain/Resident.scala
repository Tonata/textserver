package domain

import play.api.libs.json.Json

/**
  * Created by martian on 2017/02/19.
  */
case class Resident (residentID: String,
                     name: String,
                     contactNumber: String,
                     emailAddress: String,
                     areaID: String)

object Resident
{
  implicit val residentFmt = Json.format[Resident]
}
