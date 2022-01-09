Android-Study-Jams

Notes App

Problem Statement:
Note-taking is the process of capturing information from a source or event. This usually takes the form of recording, writing, jotting, paraphrasing, sketching, labelling, outlining, and annotating. Note-taking applications enable users to type, write, and draw on their devices just as they would on paper. Many applications have their own unique features, storage, organization, and sharing capabilities, and it’s up to the user to identify which note-taking application will work best for their needs.

![image](https://user-images.githubusercontent.com/91894307/148672383-f321abd0-cfce-453e-86e0-e3df287fab0c.png)



























Proposed Solution :

This Note app gives you a notepad look and feel. You can print from this app, change font style and size. Send your notes by sms and email. You can now backup and restore your notes. These Notes are stored on your device so if you lose it or delete the app you will lose your notes.

Functionality & Concepts used : 

Constraint Layout : Most of the activities in the app uses a flexible constraint layout, which is easy to handle for different screen sizes.

Simple & Easy Views Design : Use of familiar audience EditText with hints and interactive buttons made it easier for students to register or sign in without providing any detailed instructions pages. Apps also uses App Navigation to switch between different screens.

RecyclerView : To present the list of different route busses we used the efficient recyclerview. Google Maps API : We are also using the Google Maps API free version for below 1000 users. In future if the user base increases we will go for the upgraded plan too.

LiveData & Room Database : We are also using LiveData to update & observe any changes in the Bus driver's locations received from their mobile at real time and update it to local databases using Room. Coordinates are then updated in the bus route screen and students can track their route bus locations.

Navigation : Navigation refers to the interactions that allow users to navigate across, into, and back out from the different pieces of content within your app. Android Jetpack's Navigation component helps you implement navigation, from simple button clicks to more complex patterns, such as app bars and the navigation drawer. The Navigation component also ensures a consistent and predictable user experience by adhering to an established set of principles.

Application Link :

App: https://github.com/ViditChawda/Notes-App
