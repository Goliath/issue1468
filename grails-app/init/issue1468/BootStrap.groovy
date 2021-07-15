package issue1468

class BootStrap {

    def init = { servletContext ->
        new Event(person: new Adult(name: 'Jeff')).save()
    }
    def destroy = {
    }
}
