class BootStrap {

    def init = { servletContext ->
    	println "Java System Properties As Seen From Grails BootStrap"
    	System.properties.each{key, value -> println "$key: $value"}
    }
    def destroy = {
    }
}
