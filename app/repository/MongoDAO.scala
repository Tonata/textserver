package repository

import reactivemongo.bson.{BSONReader}

import scala.concurrent.ExecutionContext

/**
  * Created by martian on 2017/02/24.
  */
trait MongoDAO[T] {

  implicit val ec: ExecutionContext
  implicit val reader: BSONReader[T]

}
