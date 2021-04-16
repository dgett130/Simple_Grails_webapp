package com.grails_webapp

class Team {

    String name
    String city
    String stadium
    String logo
    String manager
    String hasMany = [players : Player]

    static constraints = {
        name size: 1..40, blank: false, unique: true
        city size: 1..30, blank: false
        stadium size: 1..30, blank: false
        logo size: 5..255, blank: false
        manager size: 5..30, blank: false
    }

    String toString() {
        name
    }
}
