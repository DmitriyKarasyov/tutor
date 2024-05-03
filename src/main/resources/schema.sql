CREATE TABLE IF NOT EXISTS meeting_points (

);

CREATE TABLE IF NOT EXISTS students (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(40) NOT NULL,
    telephone_number VARCHAR(40),
    subject VARCHAR(30),
    grade INTEGER,
    lesson_cost FLOAT(5, 2),
    CONSTRAINT pk_students PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS parents (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(40) NOT NULL,
    telephonr_number VARCHAR(40),
    CONSTRAINT pk_parents PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS students_parents (
    student_id INTEGER NOT NULL,
    parent_id INTEGER NOT NULL
)