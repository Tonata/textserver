package repository



import javax.inject.Inject

import play.api.libs.json.{JsObject, Json}
import play.modules.reactivemongo.ReactiveMongoApi
import reactivemongo.api.ReadPreference
import reactivemongo.api.commands.WriteResult
import reactivemongo.bson.{BSONDocument, BSONObjectID}
import reactivemongo.play.json.collection.JSONCollection

import scala.concurrent.{ExecutionContext, Future}

/**
  * Created by martian on 2017/02/22.
  */
class AreaRepository  @Inject() (reactiveMongoApi: ReactiveMongoApi) {

  def collection = reactiveMongoApi.db.collection[JSONCollection]("area");

  def find() (implicit ec: ExecutionContext): Future[List[JsObject]] = {

    val genericQueryBuilder = collection.find(Json.obj());

    val cursor = genericQueryBuilder.cursor[JsObject](ReadPreference.Primary);
    cursor.collect[List]()

  }

  def select(selector: BSONDocument)(implicit ec: ExecutionContext): Future[Option[JsObject]] = {
    collection.find(selector).one[JsObject]
  }

  def update(selector: BSONDocument, update: BSONDocument) (implicit ec: ExecutionContext) : Future[WriteResult] = {
    collection.update(selector, update)
  }

  def remove(document: BSONDocument) (implicit ec: ExecutionContext) : Future[WriteResult] = {
    collection.remove(document)
  }

//  def save(document: BSONDocument) (implicit ec: ExecutionContext): Future[WriteResult] = {
//    collection.update(BSONDocument( "_id" -&gt; document.get("_id").getOrElse(BSONObjectID.generate)), document, upsert = true )
//  }


}
