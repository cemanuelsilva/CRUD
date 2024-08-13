# CRUD RESTful API

This repository represents the creation of my first CRUD (Create, Read, Update, Delete) RESTful API using:

- **Java**
- **MySQL**
- **Spring Boot**
- **JPA (Java Persistence API)**
- **Maven**

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Setup](#setup)
- [API Endpoints](#api-endpoints)
- [Database Configuration](#database-configuration)
- [Running the Application](#running-the-application)


## Introduction

This project demonstrates a basic implementation of a CRUD RESTful API. It is designed to help understand how to integrate Java, Spring Boot, and MySQL to build a simple yet functional API.

## Features

- **Create**: Add new entries to the database.
- **Read**: Retrieve data from the database.
- **Update**: Modify existing entries.
- **Delete**: Remove entries from the database.

## Setup

1. **Clone the repository:**

## API Endpoints

- **GET** /users: Retrieve all users.
- **POST** /save: Create a new entry.
- **PUT** /update/{id}: Update an existing entry by ID.
- **DELETE** /delete/{id}: Delete an entry by ID.

## Database Configuration

spring.datasource.url=jdbc:mysql://localhost:3306/***your_database_name***?useSSL=false&serverTimezone=UTC #Change it here! <br />
spring.datasource.username=***your_username***  #Change it here! <br />
spring.datasource.password=***your_password***  #Change it here!

## Running the Application

After all the configuration have been done, you can just run it! :D
