# Call for Fire Tool User Stories

## Story #1: Mission Queue

Type: **feature**

_As an FSO, I can see all calls for fire in a scrollable queue so that I have situational awareness of all active and
past missions._

### Design 
![Mission Queue Mockup](mockups/cff_story1.png)

### Scenario: Display logged fire missions

```gherkin
Given at least one mission has been logged
When I open the application
Then I see a scrollable list of missions ordered newest first
And each row shows the DTG, observer ID, and status
```

### Scenario: Empty queue

```gherkin
Given no missions have been logged
When I open the application
Then I see the message "No missions logged"
```

### Scenario: Status Badge Colors

```gherkin
Given a mission with status "Pending" exists
When I view the queue
Then the status badge is amber

Given a mission with status "Sent to FDC" exists
When I view the queue
Then the status badge is blue

Given a mission with status "Shot" exists
When I view the queue
Then the status badge is green
```
