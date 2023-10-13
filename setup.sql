-- Drop the user if it already exists
DROP USER IF EXISTS 'leo_user'@'%';

-- Create a new user for the Leo project
CREATE USER 'leo_user'@'%' IDENTIFIED BY 'leo_password';

-- Grant all privileges on the 'leo_db' database to the 'leo_user'
GRANT ALL PRIVILEGES ON leo_db.* TO 'leo_user'@'%';
