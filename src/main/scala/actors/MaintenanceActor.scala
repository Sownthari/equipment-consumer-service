package actors

import akka.actor.{Actor, ActorRef}
import models._

class MaintenanceActor(notificationActor: ActorRef) extends Actor {

  def receive: Receive = {

    case evt: AllocationReturnedEvent =>
      println(s"[MaintenanceActor] Damaged event: $evt")
      notificationActor ! NotifyMaintenanceDamaged(evt)
  }
}
