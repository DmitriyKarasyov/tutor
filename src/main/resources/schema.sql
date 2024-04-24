CREATE TABLE IF NOT EXISTS meeting_points (

);

CREATE TABLE IF NOT EXISTS students (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(30) NOT NULL,
    telephone_number VARCHAR(30),
    subject VARCHAR(30),
    grade INTEGER,

    lesson_cost FLOAT,
    parent_id REFERENCES
)