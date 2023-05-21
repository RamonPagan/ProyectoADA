INSERT INTO Planet (planet_name) VALUES ('Earth')

INSERT INTO asteroid (asteroid_name, estimated_diameter_min, estimated_diameter_max, relative_velocity, orbital_period, planet_id) VALUES ('Selestina', 0.05, 0.075, 1.0, 0.003, 1)
INSERT INTO asteroid (asteroid_name, estimated_diameter_min, estimated_diameter_max, relative_velocity, orbital_period, planet_id) VALUES ('Eric', 0.025, 0.05 ,0.02 ,1.2 , 1)
INSERT INTO asteroid (asteroid_name, estimated_diameter_min, estimated_diameter_max, relative_velocity, orbital_period, planet_id) VALUES ('Ceciley', 1.0, 0.5 ,0.025, 0.01, 1)
INSERT INTO asteroid (asteroid_name, estimated_diameter_min, estimated_diameter_max, relative_velocity, orbital_period, planet_id) VALUES ('Gilemette', 1.0, 0.75, 1.0 , 1.0, 1)
INSERT INTO asteroid (asteroid_name, estimated_diameter_min, estimated_diameter_max, relative_velocity, orbital_period, planet_id) VALUES ('Elana', 0.01, 0.1, 1.0, 0.0, 1)

INSERT INTO observatory (observatory_name, observatory_country, observatory_date_inauguration) VALUES ('Nevsa', 'Italy', '2023-01-19 12:41:47')
INSERT INTO observatory (observatory_name, observatory_country, observatory_date_inauguration) VALUES ('Perren', 'Russia', '2022-10-07 15:32:16')
INSERT INTO observatory (observatory_name, observatory_country, observatory_date_inauguration) VALUES ('Ninon', 'China', '2022-02-28 17:04:52')

insert into dangerousness (impact_probability, kinetic_energy, impact_date, asteroid_id) values (0.48, 0.93, '2022-05-31 13:39:07', 1)
insert into dangerousness (impact_probability, kinetic_energy, impact_date, asteroid_id) values (0.69, 0.46, '2022-12-24 17:54:22', 2)
insert into dangerousness (impact_probability, kinetic_energy, impact_date, asteroid_id) values (0.68, 0.39, '2022-05-25 12:36:11', 3)
insert into dangerousness (impact_probability, kinetic_energy, impact_date, asteroid_id) values (0.63, 0.32, '2022-09-20 21:32:02', 4)
insert into dangerousness (impact_probability, kinetic_energy, impact_date, asteroid_id) values (0.59, 0.89, '2023-01-21 02:46:44', 5)

insert into discovery (discovery_date, discovery_method, asteroid_id, observatory_id) values ('2022-09-05 06:25:51', 'Trencher', 1, 1)
insert into discovery (discovery_date, discovery_method, asteroid_id, observatory_id) values ('2022-06-25 23:13:21', 'Skid-Steer', 2, 2)
insert into discovery (discovery_date, discovery_method, asteroid_id, observatory_id) values ('2022-03-18 00:27:41', 'Dragline', 3, 1)
insert into discovery (discovery_date, discovery_method, asteroid_id, observatory_id) values ('2023-01-09 02:51:35', 'Dump Truck', 4, 3)
insert into discovery (discovery_date, discovery_method, asteroid_id, observatory_id) values ('2022-02-25 19:25:25', 'Dump Truck', 5, 1)

insert into impact (date, kinetic_energy, dangerousness_id) values ('2022-12-15 00:01:53', 0.47, 1)
insert into impact (date, kinetic_energy, dangerousness_id) values ('2022-06-23 19:18:06', 0.66, 2)
insert into impact (date, kinetic_energy, dangerousness_id) values ('2022-08-15 18:44:46', 0.12, 3)
insert into impact (date, kinetic_energy, dangerousness_id) values ('2023-02-18 05:12:48', 0.87, 4)
insert into impact (date, kinetic_energy, dangerousness_id) values ('2022-09-30 14:13:12', 0.42, 5)

