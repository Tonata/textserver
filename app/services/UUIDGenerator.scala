package services

import java.util.UUID

/**
  * Created by martian on 2017/02/22.
  */
abstract class UUIDGenerator {
    def generate: UUID
}

@Singleton
class SimpleUUIDGenerator extends UUIDGenerator{
  override def generate: UUID  = UUID.randomUUID()
}
