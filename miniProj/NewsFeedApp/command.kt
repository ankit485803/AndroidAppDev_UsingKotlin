





/*  Youtube Channel to learn Android : Neat Roots


Q. could it possible to after creating the new proj in Android Studio,
 i want to create these new files and folders using termainla not manually like vs code



PS E:\NewsFeedApp\app> cd ..
PS E:\NewsFeedApp> cd app/src/main
PS E:\NewsFeedApp\app\src\main> ls



New-Item -ItemType Directory -Path "java/com/example/newsfeedapp/model"
New-Item -ItemType Directory -Path "java/com/example/newsfeedapp/adapter"
New-Item -ItemType Directory -Path "java/com/example/newsfeedapp/network"
New-Item -ItemType Directory -Path "java/com/example/newsfeedapp/utils"



file banawo Ankit
New-Item -ItemType File -Path "java/com/example/newsfeedapp/model/Article.kt"


Q. can i run this app on laptop without my phone because i forgot to carry cable 
Yes, you can definitely run your Android app on your laptop without a physical device by using an Android Emulator.




Register to this site https://newsapi.org/register
with papa email id sanjay485803@gmail.com and password







How to publish to this drive E to github account
Ans: Open Android Studio & initialize Git
If Git isn't already initialized:
Go to VCS > Enable Version Control Integration

Choose Git and click OK

Android Studio will now initialize Git in your project.



 Option 2: Terminal (Manual Git) jaise Ankit aap pahle kare the
Use the Terminal tab inside Android Studio:

git init
git add .
git commit -m "Initial commit"
git remote add origin https://github.com/YOUR_USERNAME/NewsFeedApp.git
git push -u origin master














Q2. how to check on which remote link our repo work after successfull push
PS E:\NewsFeedApp> git remote -v

origin  https://github.com/ankit485803/NewsFeed_AndroidApp.git (fetch)
origin  https://github.com/ankit485803/NewsFeed_AndroidApp.git (push)
PS E:\NewsFeedApp>


✅ The -v stands for "verbose".
It tells Git to show more detailed output, specifically the URLs of the remotes (for both fetch and push).

*/