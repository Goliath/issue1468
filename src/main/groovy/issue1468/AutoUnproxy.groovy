package issue1468

import org.grails.orm.hibernate.cfg.GrailsHibernateUtil
import org.hibernate.proxy.HibernateProxy

/**
 * @author Marcin Szlagor
 */
trait AutoUnproxy {

    def getProperty(String name) {
        def getterResult = getMetaClass().getProperty(this, name)
        if (getterResult instanceof HibernateProxy) {
            return GrailsHibernateUtil.unwrapIfProxy(getterResult)
        } else {
            return getterResult
        }
    }

}