INSERT INTO Person (id, parent_id) VALUES
    (1, NULL),
    (2, 1),
    (4, 1),
    (5, NULL),
    (6, 5),
    (8, 5)
    ;

INSERT INTO Pet (id, owner_id, name) VALUES
    (1, 1, "Fido"),
    (2, 1, "Spot"),
    (3, 2, "Bubbles")
    ;
