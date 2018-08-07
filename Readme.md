# Simple Recursive Relationships

This is an example of a data model with a recursive relationship. 

* Ensure a user `elide` with password `elide123` exists
* Ensure a database `elide-recursive` exists
* Start the server: `./gradlew run`
* Populate data: `mysql -uelide -pelide123 elide-recursive < src/main/resources/people.sql`
* Query: `http://localhost:8080/api/v1/person?filter[person]=parent=isnull=true&filter[pet]=name==fido`
