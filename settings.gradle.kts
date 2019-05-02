rootProject.name = "kotlin-gradle-refarch"

// spring boot application assembling backend and frontend
include (":application")

// the core game logic
include(":backend:game")

// the js frontend
include(":frontend")
