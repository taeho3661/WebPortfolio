-- 관리자모드부터 만들어보자

--회원데이터
drop table tb_user;
create table tb_user(
	user_no      	number(4) primary key,
    user_id			varchar2(20),
    user_pw       	varchar2(20),
    user_nm       	varchar2(20),
    post     		number(20),	-- readonly
    adr1    		varchar2(100), -- readonly
    adr2  			varchar2(100),
    phone1     		varchar2(20),
    phone2       	number(20),
    phone3          number(20),
    email      		varchar2(100),
    email_yn       	number(1), -- 0:비수신 1:수신
    score          	number(20),
    rank          	number(20),
    login_type      number(1), -- 0:유저 1:관리자
    del_yn          number(1)  -- 0:삭제o 1:삭제x
);

drop sequence tb_user_seq;
create sequence tb_user_seq;

--회원 샘플
insert into tb_user(user_no, user_id, user_pw, user_nm, 
post, adr1, adr2, phone1, phone2, phone3, 
email, email_yn, score, rank, login_type, del_yn) 
values (tb_user_seq.nextval, '아이디1', '비밀번호1', '이름1', 
123, '기본주소1', '상세주소1', '010', 1111, 1111, 
'메일1@gmail.com', 1, 0, 0, 0, 1);
insert into tb_user(user_no, user_id, user_pw, user_nm, 
post, adr1, adr2, phone1, phone2, phone3, 
email, email_yn, score, rank, login_type, del_yn) 
values (tb_user_seq.nextval, '아이디2', '비밀번호2', '이름2', 
123, '기본주소2', '상세주소2', '010', 1111, 2222, 
'메일2@gmail.com', 1, 0, 0, 0, 1);
insert into tb_user(user_no, user_id, user_pw, user_nm, 
post, adr1, adr2, phone1, phone2, phone3, 
email, email_yn, score, rank, login_type, del_yn) 
values (tb_user_seq.nextval, '아이디3', '비밀번호3', '이름3', 
123, '기본주소3', '상세주소3', '010', 1111, 3333, 
'메일3@gmail.com', 1, 0, 0, 0, 1);
--
--
--
--
--상품데이터
drop table  tb_item;
create table  tb_item(
	item_id      	number(4) primary key,
    item_nm			varchar2(40),
    price       	number(20),
    stock       	number(20),
    item_img  		varchar2(200),    
    de_fee    		number(20),
    con_img     	varchar2(200)
);

drop sequence tb_item_seq;
create sequence tb_item_seq;

--item 샘플
insert into tb_item(item_id, item_nm, price, stock, item_img, de_fee, con_img) 
values (tb_item_seq.nextval, '샌드위치', 50000, 100, 'https://ifh.cc/g/SkXbo6.jpg', 3000, 'https://ifh.cc/g/xt20xS.jpg');
insert into tb_item(item_id, item_nm, price, stock, item_img, de_fee, con_img) 
values (tb_item_seq.nextval, '아이스크림와플', 50000, 100, 'https://ifh.cc/g/uPjOSq.jpg', 3000, null);