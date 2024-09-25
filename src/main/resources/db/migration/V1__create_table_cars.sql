CREATE TABLE cars (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    marca VARCHAR(255) NOT NULL,
    modelo VARCHAR(255) NOT NULL,
    preco INT CHECK(preco >= 1) NOT NULL
);


INSERT INTO cars (id, marca, modelo, preco) VALUES
    (gen_random_uuid(), 'Toyota', 'Corolla', 20000),
    (gen_random_uuid(), 'Honda', 'Civic', 22000),
    (gen_random_uuid(), 'Ford', 'Fiesta', 15000),
    (gen_random_uuid(), 'Chevrolet', 'Onix', 18000),
    (gen_random_uuid(), 'Volkswagen', 'Golf', 25000);


