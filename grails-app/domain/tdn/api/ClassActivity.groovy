package tdn.api

class ClassActivity {

    static belongsTo = [clazz: Class]

    String title
    String detail
    Date dueDate
    String uri

    static constraints = {
    }
}
