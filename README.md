Rafael SpringBoot Heroku Deploy Study
---

This project is a study of heroku environment using Kotlin, Gradle and SpringBoot with JPA and SpringDoc + Swagger

Heroku only allow to push to `master` or `main` branch. Bellow there is some example of code that create a heroku
environment and install postgresql plugin. Then deploy it.

```shell
> heroku create
> heroku addons:create heroku-postgresql    
> git push heroku develop:master
```