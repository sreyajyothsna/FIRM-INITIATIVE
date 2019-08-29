CREATE DATABASE IF NOT EXISTS FI;

USE FI;

CREATE TABLE Reference_table ( Ref_Key	Varchar(10),Ref_id Varchar(10),Ref_Name Varchar(50),Ref_value_1 Varchar(50),Ref_value_2	float(10));

CREATE TABLE Period_table ( finacial_year Varchar(4),Start_date	Date ,End_date	Date ,Week	Varchar (3),weekstart_date	Date,weekend_date	Date,period	Varchar	(3),finacial_year_period	Varchar	(8));

CREATE TABLE Hire_table( Hire_category varchar(50),p1 int,p2 int,p3 int,p4 int,p5 int,p6 int,p7 int,p8 int,p9 int,p10 int,p11 int,p12 int,p13 int,Comments varchar(200));

CREATE TABLE  Roll_on_table(Portfolio Varchar(10),Offering Varchar(10),Talent_group Varchar(50),sub_talent_group Varchar(50),Client_name	Varchar(50),Period Varchar(10),Week Varchar(3),Stage Varchar(20),tot_pract_required	int,Probability	float,Start_date	date,end_date date,requested_date	date,skills	Varchar(50),Hcatelog_skills	Varchar(50));

CREATE TABLE  Roll_off_table(Business_line Varchar(50),Capability Varchar(50), sub_capability Varchar(50), Candidate_name Varchar(50), email Varchar(50),level Varchar(30),location Varchar(30),Roll_off_date date,Billing_status Varchar(30),Deployable Varchar(30),Staffing_notes Varchar(2000),Primary_skill Varchar(50),Secondary_skill Varchar(50));
