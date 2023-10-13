# Use the official MySQL image as the base image
FROM mysql:latest

# Set the environment variables for the Leo Project
ENV MYSQL_ROOT_PASSWORD=mysecretpassword
ENV MYSQL_DATABASE=leo_db
ENV MYSQL_USER=leo_user
ENV MYSQL_PASSWORD=leo_password

# Expose the default MySQL port
EXPOSE 3306