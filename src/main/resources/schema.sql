CREATE TABLE IF NOT EXISTS meeting_ponts (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    online_link VARCHAR(40),
    offline_address VARCHAR(40),
    CONSTRAINT pk_meeting_pont PRIMARY KEY (meeting_point_id)
);

CREATE TABLE IF NOT EXISTS students (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(40) NOT NULL,
    telephone_number VARCHAR(40),
    subject VARCHAR(30),
    grade INTEGER,
    meeting_point_id INTEGER REFERENCES meeting_points (id) ON DELETE RESTRICT,
    lesson_cost DECIMAL(5, 2),
    CONSTRAINT pk_students PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS parents (
    id INTEGER GENERATED ALWAYS AS IDENTITY,
    name VARCHAR(40) NOT NULL,
    telephonr_number VARCHAR(40),
    CONSTRAINT pk_parents PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS students_parents (
    student_id INTEGER NOT NULL,
    parent_id INTEGER NOT NULL
);

