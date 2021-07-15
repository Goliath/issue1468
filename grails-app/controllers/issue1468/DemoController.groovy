package issue1468

import org.grails.orm.hibernate.cfg.GrailsHibernateUtil

class DemoController {

    def index() {
        def event = Event.first()
        // this works
//        render GrailsHibernateUtil.unwrapIfProxy(event.person).isMarried()

        // This will throw ClassCastException
        render event.person.isMarried()
    }
}
