PGDMP                         x            customer_dataset    9.6.10    12.3     P           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            Q           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            R           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            S           1262    125210    customer_dataset    DATABASE     �   CREATE DATABASE customer_dataset WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'English_India.1252' LC_CTYPE = 'English_India.1252';
     DROP DATABASE customer_dataset;
                postgres    false            �            1259    125233    customer    TABLE       CREATE TABLE public.customer (
    id integer NOT NULL,
    first_name character varying(45) DEFAULT NULL::character varying,
    last_name character varying(45) DEFAULT NULL::character varying,
    email character varying(45) DEFAULT NULL::character varying
);
    DROP TABLE public.customer;
       public            postgres    false            �            1259    125231    customer_id_seq    SEQUENCE     x   CREATE SEQUENCE public.customer_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.customer_id_seq;
       public          postgres    false    186            T           0    0    customer_id_seq    SEQUENCE OWNED BY     C   ALTER SEQUENCE public.customer_id_seq OWNED BY public.customer.id;
          public          postgres    false    185            �           2604    125236    customer id    DEFAULT     j   ALTER TABLE ONLY public.customer ALTER COLUMN id SET DEFAULT nextval('public.customer_id_seq'::regclass);
 :   ALTER TABLE public.customer ALTER COLUMN id DROP DEFAULT;
       public          postgres    false    185    186    186            M          0    125233    customer 
   TABLE DATA           D   COPY public.customer (id, first_name, last_name, email) FROM stdin;
    public          postgres    false    186   5       U           0    0    customer_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.customer_id_seq', 9, true);
          public          postgres    false    185            �           2606    125241    customer customer_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.customer DROP CONSTRAINT customer_pkey;
       public            postgres    false    186            M   �   x�M�A
� ��x��@HRZ�� ��$_��D	��ku����f ���:e��!��@#��|�"��j�50>zNA��sp�� b_/�'����
j���ԃ��؟�-9s�n0��p�%�ڋ�I_S��7b�N]�8]o���	tQS     