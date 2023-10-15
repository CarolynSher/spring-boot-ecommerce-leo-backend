-- Users Table: To store user information.
CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Products Table: For storing details about the Mtungas.
CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2) NOT NULL,
    image_url VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Orders Table: To keep track of orders placed.
CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    total_price DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- OrderDetails Table: To store details of products in each order.
CREATE TABLE order_details (
    id INT AUTO_INCREMENT PRIMARY KEY,
    order_id INT,
    product_id INT,
    quantity INT NOT NULL,
    price DECIMAL(10, 2) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (order_id) REFERENCES orders(id),
    FOREIGN KEY (product_id) REFERENCES products(id)
);

-- Addresses Table: For storing user addresses.
CREATE TABLE addresses (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT,
    country VARCHAR(255) NOT NULL,
    first_level_division VARCHAR(255) NOT NULL,
    details TEXT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);

-- Inserting sample data

-- Inserting sample users
INSERT INTO users (username, password, email) VALUES ('leoUser1', 'password1', 'leoUser1@example.com');
INSERT INTO users (username, password, email) VALUES ('leoUser2', 'password2', 'leoUser2@example.com');

-- Inserting sample products (Mtungas)
INSERT INTO products (name, description, price, image_url) VALUES ('Mtunga1', 'Description for Mtunga1', 100.00, 'assets/images/products/water_bottle.jpeg');
