package issue1468

class DemoController {

    def index() {
        def event = Event.first()

        // this works
//        render GrailsHibernateUtil.unwrapIfProxy(event.person).isMarried()

        println "instanceof person ${event.person instanceof Person}"

        render event.person.isMarried()
    }
}
