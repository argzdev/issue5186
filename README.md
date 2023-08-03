# issue 5186
### Summary
- FirebaseApp.delete() does not clean FirebaseSessions callbacks
### Steps to reproduce
- Run app
- Wait for a few seconds to allow Firebase Sessions to trigger callback.
- App will crash
