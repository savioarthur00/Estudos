PGDMP                         y            Socamp    12.0    12.0 �    r           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false            s           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false            t           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false            u           1262    41117    Socamp    DATABASE     �   CREATE DATABASE "Socamp" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';
    DROP DATABASE "Socamp";
                postgres    false                       1255    174193    Confirmacao_trigger()    FUNCTION     �   CREATE FUNCTION public."Confirmacao_trigger"() RETURNS trigger
    LANGUAGE plpgsql
    AS $$BEGIN 
	RAISE NOTICE 'PRIMEIRA TRIGGER SIMPLES';
	return NEW;
END;$$;
 .   DROP FUNCTION public."Confirmacao_trigger"();
       public          postgres    false                       1255    174598    dataCadastro()    FUNCTION     �   CREATE FUNCTION public."dataCadastro"() RETURNS trigger
    LANGUAGE plpgsql
    AS $$BEGIN 
	NEW.dataCadastro = now();
	return NEW;
END;
	$$;
 '   DROP FUNCTION public."dataCadastro"();
       public          postgres    false                       1255    180635    desconto_novo()    FUNCTION     �   CREATE FUNCTION public.desconto_novo() RETURNS trigger
    LANGUAGE plpgsql
    AS $$BEGIN 
	
	NEW.v_desconto=(NEW.valor * 0.2);
	return NEW;
END;$$;
 &   DROP FUNCTION public.desconto_novo();
       public          postgres    false                       1255    180638    descricao(integer)    FUNCTION     )  CREATE FUNCTION public.descricao(tipo integer) RETURNS text
    LANGUAGE plpgsql
    AS $$
BEGIN 
	IF tipo = 0 THEN 
	   RETURN 'Sócio';
	   
	ELSIF tipo =1 THEN
		RETURN 'Funcionário' ;
	ELSIF tipo =2 THEN
		RETURN 'Administrador';
	ELSIF tipo =3 THEN
		RETURN 'PRESIDENTE';
	END IF;

END;
$$;
 .   DROP FUNCTION public.descricao(tipo integer);
       public          postgres    false                       1255    180637    total_bar(integer, integer)    FUNCTION     �   CREATE FUNCTION public.total_bar(valor_conta_1 integer, valor_conta_2 integer) RETURNS integer
    LANGUAGE plpgsql
    AS $$ 
BEGIN 
	RETURN valor_conta_1 + valor_conta_2;
END;
$$;
 N   DROP FUNCTION public.total_bar(valor_conta_1 integer, valor_conta_2 integer);
       public          postgres    false            �            1259    41128    adm_seq    SEQUENCE     p   CREATE SEQUENCE public.adm_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
    DROP SEQUENCE public.adm_seq;
       public          postgres    false            �            1259    212194    administrador    TABLE     �   CREATE TABLE public.administrador (
    id bigint NOT NULL,
    cpf character varying(255),
    nascimento date,
    nome character varying(255),
    tipo integer
);
 !   DROP TABLE public.administrador;
       public         heap    postgres    false            �            1259    212299    administrador_contato    TABLE     t   CREATE TABLE public.administrador_contato (
    administrador_id bigint NOT NULL,
    contato_id bigint NOT NULL
);
 )   DROP TABLE public.administrador_contato;
       public         heap    postgres    false            �            1259    212304    administrador_endereco    TABLE     v   CREATE TABLE public.administrador_endereco (
    administrador_id bigint NOT NULL,
    endereco_id bigint NOT NULL
);
 *   DROP TABLE public.administrador_endereco;
       public         heap    postgres    false            �            1259    212309    administrador_login    TABLE     p   CREATE TABLE public.administrador_login (
    administrador_id bigint NOT NULL,
    login_id bigint NOT NULL
);
 '   DROP TABLE public.administrador_login;
       public         heap    postgres    false            �            1259    212651    administrador_seq    SEQUENCE     z   CREATE SEQUENCE public.administrador_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.administrador_seq;
       public          postgres    false            �            1259    212202    bar    TABLE     4   CREATE TABLE public.bar (
    id bigint NOT NULL
);
    DROP TABLE public.bar;
       public         heap    postgres    false            �            1259    212314    bar_produto    TABLE     `   CREATE TABLE public.bar_produto (
    bar_id bigint NOT NULL,
    produto_id bigint NOT NULL
);
    DROP TABLE public.bar_produto;
       public         heap    postgres    false                       1259    212667    bar_seq    SEQUENCE     p   CREATE SEQUENCE public.bar_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
    DROP SEQUENCE public.bar_seq;
       public          postgres    false            �            1259    212223    clube    TABLE     -  CREATE TABLE public.clube (
    id bigint NOT NULL,
    cidade character varying(255),
    cnpj character varying(255),
    endereco character varying(255),
    nome character varying(255),
    administrador_id bigint,
    funcionario_id bigint,
    presidente_id bigint,
    pix character varying
);
    DROP TABLE public.clube;
       public         heap    postgres    false            �            1259    212649 	   clube_seq    SEQUENCE     r   CREATE SEQUENCE public.clube_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.clube_seq;
       public          postgres    false            �            1259    212349    clube_socio    TABLE     `   CREATE TABLE public.clube_socio (
    clube_id bigint NOT NULL,
    socio_id bigint NOT NULL
);
    DROP TABLE public.clube_socio;
       public         heap    postgres    false            �            1259    212239    conta    TABLE     m   CREATE TABLE public.conta (
    id bigint NOT NULL,
    data date,
    total integer,
    socio_id bigint
);
    DROP TABLE public.conta;
       public         heap    postgres    false            �            1259    212379    conta_produto    TABLE     e   CREATE TABLE public.conta_produto (
    conta_id bigint NOT NULL,
    consumos_id bigint NOT NULL
);
 !   DROP TABLE public.conta_produto;
       public         heap    postgres    false            �            1259    212659 	   conta_seq    SEQUENCE     r   CREATE SEQUENCE public.conta_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.conta_seq;
       public          postgres    false            �            1259    212257    contato    TABLE        CREATE TABLE public.contato (
    id bigint NOT NULL,
    email character varying(255),
    telefone character varying(255)
);
    DROP TABLE public.contato;
       public         heap    postgres    false            �            1259    212647    contato_seq    SEQUENCE     v   CREATE SEQUENCE public.contato_seq
    START WITH 50
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.contato_seq;
       public          postgres    false            �            1259    212265    endereco    TABLE     �   CREATE TABLE public.endereco (
    id bigint NOT NULL,
    bairro character varying(255),
    cep character varying(255),
    cidade character varying(255),
    numero character varying(255),
    rua character varying(255)
);
    DROP TABLE public.endereco;
       public         heap    postgres    false            �            1259    212663    endereco_seq    SEQUENCE     w   CREATE SEQUENCE public.endereco_seq
    START WITH 50
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.endereco_seq;
       public          postgres    false            �            1259    41551    fun_seq    SEQUENCE     p   CREATE SEQUENCE public.fun_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
    DROP SEQUENCE public.fun_seq;
       public          postgres    false            �            1259    212207    funcionario    TABLE     �   CREATE TABLE public.funcionario (
    id bigint NOT NULL,
    cpf character varying(255),
    nascimento date,
    nome character varying(255),
    salario integer,
    tipo integer
);
    DROP TABLE public.funcionario;
       public         heap    postgres    false            �            1259    212319    funcionario_contato    TABLE     p   CREATE TABLE public.funcionario_contato (
    funcionario_id bigint NOT NULL,
    contato_id bigint NOT NULL
);
 '   DROP TABLE public.funcionario_contato;
       public         heap    postgres    false            �            1259    212324    funcionario_endereco    TABLE     r   CREATE TABLE public.funcionario_endereco (
    funcionario_id bigint NOT NULL,
    endereco_id bigint NOT NULL
);
 (   DROP TABLE public.funcionario_endereco;
       public         heap    postgres    false            �            1259    212329    funcionario_login    TABLE     l   CREATE TABLE public.funcionario_login (
    funcionario_id bigint NOT NULL,
    login_id bigint NOT NULL
);
 %   DROP TABLE public.funcionario_login;
       public         heap    postgres    false            �            1259    212645    funcionario_seq    SEQUENCE     x   CREATE SEQUENCE public.funcionario_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.funcionario_seq;
       public          postgres    false            �            1259    212273    login    TABLE     �   CREATE TABLE public.login (
    id bigint NOT NULL,
    login character varying(255),
    senha character varying(255),
    tipo integer
);
    DROP TABLE public.login;
       public         heap    postgres    false            �            1259    212244    mensalidade    TABLE     �   CREATE TABLE public.mensalidade (
    id bigint NOT NULL,
    data date,
    status character varying(255),
    valor integer,
    socio_id bigint
);
    DROP TABLE public.mensalidade;
       public         heap    postgres    false                        1259    212665    mensalidade_seq    SEQUENCE     x   CREATE SEQUENCE public.mensalidade_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 &   DROP SEQUENCE public.mensalidade_seq;
       public          postgres    false            �            1259    212281    partida    TABLE     �   CREATE TABLE public.partida (
    id bigint NOT NULL,
    data date,
    duracao character varying(255),
    horario character varying(255),
    time_a_id bigint,
    time_b_id bigint
);
    DROP TABLE public.partida;
       public         heap    postgres    false            �            1259    212655    partida_seq    SEQUENCE     t   CREATE SEQUENCE public.partida_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.partida_seq;
       public          postgres    false            �            1259    41135    pre_seq    SEQUENCE     p   CREATE SEQUENCE public.pre_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
    DROP SEQUENCE public.pre_seq;
       public          postgres    false            �            1259    212215 
   presidente    TABLE     �   CREATE TABLE public.presidente (
    id bigint NOT NULL,
    cpf character varying(255),
    nascimento date,
    nome character varying(255),
    tipo integer
);
    DROP TABLE public.presidente;
       public         heap    postgres    false            �            1259    212334    presidente_contato    TABLE     n   CREATE TABLE public.presidente_contato (
    presidente_id bigint NOT NULL,
    contato_id bigint NOT NULL
);
 &   DROP TABLE public.presidente_contato;
       public         heap    postgres    false            �            1259    212339    presidente_endereco    TABLE     p   CREATE TABLE public.presidente_endereco (
    presidente_id bigint NOT NULL,
    endereco_id bigint NOT NULL
);
 '   DROP TABLE public.presidente_endereco;
       public         heap    postgres    false            �            1259    212344    presidente_login    TABLE     j   CREATE TABLE public.presidente_login (
    presidente_id bigint NOT NULL,
    login_id bigint NOT NULL
);
 $   DROP TABLE public.presidente_login;
       public         heap    postgres    false            �            1259    212639    presidente_seq    SEQUENCE     w   CREATE SEQUENCE public.presidente_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.presidente_seq;
       public          postgres    false            �            1259    212249    produto    TABLE     �   CREATE TABLE public.produto (
    id bigint NOT NULL,
    nome character varying(255),
    quantidade character varying(255),
    tipo character varying(255),
    valor character varying(255),
    bar_id bigint
);
    DROP TABLE public.produto;
       public         heap    postgres    false            �            1259    212641    produto_seq    SEQUENCE     t   CREATE SEQUENCE public.produto_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.produto_seq;
       public          postgres    false            �            1259    52339    produtos_seq    SEQUENCE     u   CREATE SEQUENCE public.produtos_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.produtos_seq;
       public          postgres    false            �            1259    41553    soc_seq    SEQUENCE     p   CREATE SEQUENCE public.soc_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
    DROP SEQUENCE public.soc_seq;
       public          postgres    false            �            1259    212231    socio    TABLE     �   CREATE TABLE public.socio (
    id bigint NOT NULL,
    cpf character varying(255),
    nascimento date,
    nome character varying(255),
    tipo integer,
    clube_id bigint,
    datacadastro timestamp with time zone
);
    DROP TABLE public.socio;
       public         heap    postgres    false            �            1259    212354    socio_conta    TABLE     `   CREATE TABLE public.socio_conta (
    socio_id bigint NOT NULL,
    conta_id bigint NOT NULL
);
    DROP TABLE public.socio_conta;
       public         heap    postgres    false            �            1259    212359    socio_contato    TABLE     d   CREATE TABLE public.socio_contato (
    socio_id bigint NOT NULL,
    contato_id bigint NOT NULL
);
 !   DROP TABLE public.socio_contato;
       public         heap    postgres    false            �            1259    212364    socio_endereco    TABLE     f   CREATE TABLE public.socio_endereco (
    socio_id bigint NOT NULL,
    endereco_id bigint NOT NULL
);
 "   DROP TABLE public.socio_endereco;
       public         heap    postgres    false            �            1259    212369    socio_login    TABLE     `   CREATE TABLE public.socio_login (
    socio_id bigint NOT NULL,
    login_id bigint NOT NULL
);
    DROP TABLE public.socio_login;
       public         heap    postgres    false            �            1259    212374    socio_mensalidade    TABLE     l   CREATE TABLE public.socio_mensalidade (
    socio_id bigint NOT NULL,
    mensalidade_id bigint NOT NULL
);
 %   DROP TABLE public.socio_mensalidade;
       public         heap    postgres    false            �            1259    212657 	   socio_seq    SEQUENCE     r   CREATE SEQUENCE public.socio_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.socio_seq;
       public          postgres    false            �            1259    212289    time_a    TABLE     f   CREATE TABLE public.time_a (
    id bigint NOT NULL,
    quantidade integer,
    partida_id bigint
);
    DROP TABLE public.time_a;
       public         heap    postgres    false            �            1259    212384    time_a_socio    TABLE     m   CREATE TABLE public.time_a_socio (
    time_a_id bigint NOT NULL,
    jogadoresdotimea_id bigint NOT NULL
);
     DROP TABLE public.time_a_socio;
       public         heap    postgres    false            �            1259    212294    time_b    TABLE     f   CREATE TABLE public.time_b (
    id bigint NOT NULL,
    quantidade integer,
    partida_id bigint
);
    DROP TABLE public.time_b;
       public         heap    postgres    false            �            1259    212389    time_b_socio    TABLE     l   CREATE TABLE public.time_b_socio (
    time_b_id bigint NOT NULL,
    jogadoredotimeb_id bigint NOT NULL
);
     DROP TABLE public.time_b_socio;
       public         heap    postgres    false            �            1259    212653 	   timea_seq    SEQUENCE     r   CREATE SEQUENCE public.timea_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.timea_seq;
       public          postgres    false            �            1259    198395    timea_socio    TABLE     `   CREATE TABLE public.timea_socio (
    timea_id bigint NOT NULL,
    socio_id bigint NOT NULL
);
    DROP TABLE public.timea_socio;
       public         heap    postgres    false            �            1259    212661 	   timeb_seq    SEQUENCE     r   CREATE SEQUENCE public.timeb_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
     DROP SEQUENCE public.timeb_seq;
       public          postgres    false            �            1259    198400    timeb_socio    TABLE     `   CREATE TABLE public.timeb_socio (
    timeb_id bigint NOT NULL,
    socio_id bigint NOT NULL
);
    DROP TABLE public.timeb_socio;
       public         heap    postgres    false            �            1259    212643    usuario_seq    SEQUENCE     v   CREATE SEQUENCE public.usuario_seq
    START WITH 50
    INCREMENT BY 50
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.usuario_seq;
       public          postgres    false            ?          0    212194    administrador 
   TABLE DATA           H   COPY public.administrador (id, cpf, nascimento, nome, tipo) FROM stdin;
    public          postgres    false    209   K�       N          0    212299    administrador_contato 
   TABLE DATA           M   COPY public.administrador_contato (administrador_id, contato_id) FROM stdin;
    public          postgres    false    224   ��       O          0    212304    administrador_endereco 
   TABLE DATA           O   COPY public.administrador_endereco (administrador_id, endereco_id) FROM stdin;
    public          postgres    false    225   ��       P          0    212309    administrador_login 
   TABLE DATA           I   COPY public.administrador_login (administrador_id, login_id) FROM stdin;
    public          postgres    false    226   ��       @          0    212202    bar 
   TABLE DATA           !   COPY public.bar (id) FROM stdin;
    public          postgres    false    210   ��       Q          0    212314    bar_produto 
   TABLE DATA           9   COPY public.bar_produto (bar_id, produto_id) FROM stdin;
    public          postgres    false    227   �       C          0    212223    clube 
   TABLE DATA           w   COPY public.clube (id, cidade, cnpj, endereco, nome, administrador_id, funcionario_id, presidente_id, pix) FROM stdin;
    public          postgres    false    213   5�       X          0    212349    clube_socio 
   TABLE DATA           9   COPY public.clube_socio (clube_id, socio_id) FROM stdin;
    public          postgres    false    234   ��       E          0    212239    conta 
   TABLE DATA           :   COPY public.conta (id, data, total, socio_id) FROM stdin;
    public          postgres    false    215   ��       ^          0    212379    conta_produto 
   TABLE DATA           >   COPY public.conta_produto (conta_id, consumos_id) FROM stdin;
    public          postgres    false    240   2�       H          0    212257    contato 
   TABLE DATA           6   COPY public.contato (id, email, telefone) FROM stdin;
    public          postgres    false    218   a�       I          0    212265    endereco 
   TABLE DATA           H   COPY public.endereco (id, bairro, cep, cidade, numero, rua) FROM stdin;
    public          postgres    false    219   4�       A          0    212207    funcionario 
   TABLE DATA           O   COPY public.funcionario (id, cpf, nascimento, nome, salario, tipo) FROM stdin;
    public          postgres    false    211   [       R          0    212319    funcionario_contato 
   TABLE DATA           I   COPY public.funcionario_contato (funcionario_id, contato_id) FROM stdin;
    public          postgres    false    228   �       S          0    212324    funcionario_endereco 
   TABLE DATA           K   COPY public.funcionario_endereco (funcionario_id, endereco_id) FROM stdin;
    public          postgres    false    229   �       T          0    212329    funcionario_login 
   TABLE DATA           E   COPY public.funcionario_login (funcionario_id, login_id) FROM stdin;
    public          postgres    false    230   �       J          0    212273    login 
   TABLE DATA           7   COPY public.login (id, login, senha, tipo) FROM stdin;
    public          postgres    false    220         F          0    212244    mensalidade 
   TABLE DATA           H   COPY public.mensalidade (id, data, status, valor, socio_id) FROM stdin;
    public          postgres    false    216   i      K          0    212281    partida 
   TABLE DATA           S   COPY public.partida (id, data, duracao, horario, time_a_id, time_b_id) FROM stdin;
    public          postgres    false    221   �      B          0    212215 
   presidente 
   TABLE DATA           E   COPY public.presidente (id, cpf, nascimento, nome, tipo) FROM stdin;
    public          postgres    false    212   �      U          0    212334    presidente_contato 
   TABLE DATA           G   COPY public.presidente_contato (presidente_id, contato_id) FROM stdin;
    public          postgres    false    231   @      V          0    212339    presidente_endereco 
   TABLE DATA           I   COPY public.presidente_endereco (presidente_id, endereco_id) FROM stdin;
    public          postgres    false    232   a      W          0    212344    presidente_login 
   TABLE DATA           C   COPY public.presidente_login (presidente_id, login_id) FROM stdin;
    public          postgres    false    233   �      G          0    212249    produto 
   TABLE DATA           L   COPY public.produto (id, nome, quantidade, tipo, valor, bar_id) FROM stdin;
    public          postgres    false    217   �      D          0    212231    socio 
   TABLE DATA           X   COPY public.socio (id, cpf, nascimento, nome, tipo, clube_id, datacadastro) FROM stdin;
    public          postgres    false    214   b      Y          0    212354    socio_conta 
   TABLE DATA           9   COPY public.socio_conta (socio_id, conta_id) FROM stdin;
    public          postgres    false    235   c      Z          0    212359    socio_contato 
   TABLE DATA           =   COPY public.socio_contato (socio_id, contato_id) FROM stdin;
    public          postgres    false    236   �      [          0    212364    socio_endereco 
   TABLE DATA           ?   COPY public.socio_endereco (socio_id, endereco_id) FROM stdin;
    public          postgres    false    237   �      \          0    212369    socio_login 
   TABLE DATA           9   COPY public.socio_login (socio_id, login_id) FROM stdin;
    public          postgres    false    238   
      ]          0    212374    socio_mensalidade 
   TABLE DATA           E   COPY public.socio_mensalidade (socio_id, mensalidade_id) FROM stdin;
    public          postgres    false    239   C      L          0    212289    time_a 
   TABLE DATA           <   COPY public.time_a (id, quantidade, partida_id) FROM stdin;
    public          postgres    false    222   x      _          0    212384    time_a_socio 
   TABLE DATA           F   COPY public.time_a_socio (time_a_id, jogadoresdotimea_id) FROM stdin;
    public          postgres    false    241   �      M          0    212294    time_b 
   TABLE DATA           <   COPY public.time_b (id, quantidade, partida_id) FROM stdin;
    public          postgres    false    223   �      `          0    212389    time_b_socio 
   TABLE DATA           E   COPY public.time_b_socio (time_b_id, jogadoredotimeb_id) FROM stdin;
    public          postgres    false    242   �      =          0    198395    timea_socio 
   TABLE DATA           9   COPY public.timea_socio (timea_id, socio_id) FROM stdin;
    public          postgres    false    207          >          0    198400    timeb_socio 
   TABLE DATA           9   COPY public.timeb_socio (timeb_id, socio_id) FROM stdin;
    public          postgres    false    208   !      v           0    0    adm_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('public.adm_seq', 18, true);
          public          postgres    false    202            w           0    0    administrador_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.administrador_seq', 1, true);
          public          postgres    false    249            x           0    0    bar_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('public.bar_seq', 1, true);
          public          postgres    false    257            y           0    0 	   clube_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.clube_seq', 1, true);
          public          postgres    false    248            z           0    0 	   conta_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.conta_seq', 6, true);
          public          postgres    false    253            {           0    0    contato_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.contato_seq', 250, true);
          public          postgres    false    247            |           0    0    endereco_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.endereco_seq', 250, true);
          public          postgres    false    255            }           0    0    fun_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('public.fun_seq', 1, false);
          public          postgres    false    204            ~           0    0    funcionario_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.funcionario_seq', 1, true);
          public          postgres    false    246                       0    0    mensalidade_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.mensalidade_seq', 6, true);
          public          postgres    false    256            �           0    0    partida_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.partida_seq', 1, true);
          public          postgres    false    251            �           0    0    pre_seq    SEQUENCE SET     5   SELECT pg_catalog.setval('public.pre_seq', 5, true);
          public          postgres    false    203            �           0    0    presidente_seq    SEQUENCE SET     <   SELECT pg_catalog.setval('public.presidente_seq', 1, true);
          public          postgres    false    243            �           0    0    produto_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.produto_seq', 12, true);
          public          postgres    false    244            �           0    0    produtos_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.produtos_seq', 10, true);
          public          postgres    false    206            �           0    0    soc_seq    SEQUENCE SET     6   SELECT pg_catalog.setval('public.soc_seq', 1, false);
          public          postgres    false    205            �           0    0 	   socio_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.socio_seq', 6, true);
          public          postgres    false    252            �           0    0 	   timea_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.timea_seq', 1, true);
          public          postgres    false    250            �           0    0 	   timeb_seq    SEQUENCE SET     7   SELECT pg_catalog.setval('public.timeb_seq', 1, true);
          public          postgres    false    254            �           0    0    usuario_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.usuario_seq', 250, true);
          public          postgres    false    245            c           2606    212303 0   administrador_contato administrador_contato_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.administrador_contato
    ADD CONSTRAINT administrador_contato_pkey PRIMARY KEY (administrador_id, contato_id);
 Z   ALTER TABLE ONLY public.administrador_contato DROP CONSTRAINT administrador_contato_pkey;
       public            postgres    false    224    224            e           2606    212308 2   administrador_endereco administrador_endereco_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.administrador_endereco
    ADD CONSTRAINT administrador_endereco_pkey PRIMARY KEY (administrador_id, endereco_id);
 \   ALTER TABLE ONLY public.administrador_endereco DROP CONSTRAINT administrador_endereco_pkey;
       public            postgres    false    225    225            g           2606    212313 ,   administrador_login administrador_login_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.administrador_login
    ADD CONSTRAINT administrador_login_pkey PRIMARY KEY (administrador_id, login_id);
 V   ALTER TABLE ONLY public.administrador_login DROP CONSTRAINT administrador_login_pkey;
       public            postgres    false    226    226            E           2606    212201     administrador administrador_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.administrador
    ADD CONSTRAINT administrador_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.administrador DROP CONSTRAINT administrador_pkey;
       public            postgres    false    209            G           2606    212206    bar bar_pkey 
   CONSTRAINT     J   ALTER TABLE ONLY public.bar
    ADD CONSTRAINT bar_pkey PRIMARY KEY (id);
 6   ALTER TABLE ONLY public.bar DROP CONSTRAINT bar_pkey;
       public            postgres    false    210            i           2606    212318    bar_produto bar_produto_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.bar_produto
    ADD CONSTRAINT bar_produto_pkey PRIMARY KEY (bar_id, produto_id);
 F   ALTER TABLE ONLY public.bar_produto DROP CONSTRAINT bar_produto_pkey;
       public            postgres    false    227    227            M           2606    212230    clube clube_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.clube
    ADD CONSTRAINT clube_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.clube DROP CONSTRAINT clube_pkey;
       public            postgres    false    213            w           2606    212353    clube_socio clube_socio_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.clube_socio
    ADD CONSTRAINT clube_socio_pkey PRIMARY KEY (clube_id, socio_id);
 F   ALTER TABLE ONLY public.clube_socio DROP CONSTRAINT clube_socio_pkey;
       public            postgres    false    234    234            Q           2606    212243    conta conta_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.conta
    ADD CONSTRAINT conta_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.conta DROP CONSTRAINT conta_pkey;
       public            postgres    false    215            �           2606    212383     conta_produto conta_produto_pkey 
   CONSTRAINT     q   ALTER TABLE ONLY public.conta_produto
    ADD CONSTRAINT conta_produto_pkey PRIMARY KEY (conta_id, consumos_id);
 J   ALTER TABLE ONLY public.conta_produto DROP CONSTRAINT conta_produto_pkey;
       public            postgres    false    240    240            W           2606    212264    contato contato_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.contato
    ADD CONSTRAINT contato_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.contato DROP CONSTRAINT contato_pkey;
       public            postgres    false    218            Y           2606    212272    endereco endereco_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.endereco
    ADD CONSTRAINT endereco_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.endereco DROP CONSTRAINT endereco_pkey;
       public            postgres    false    219            k           2606    212323 ,   funcionario_contato funcionario_contato_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_contato
    ADD CONSTRAINT funcionario_contato_pkey PRIMARY KEY (funcionario_id, contato_id);
 V   ALTER TABLE ONLY public.funcionario_contato DROP CONSTRAINT funcionario_contato_pkey;
       public            postgres    false    228    228            m           2606    212328 .   funcionario_endereco funcionario_endereco_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_endereco
    ADD CONSTRAINT funcionario_endereco_pkey PRIMARY KEY (funcionario_id, endereco_id);
 X   ALTER TABLE ONLY public.funcionario_endereco DROP CONSTRAINT funcionario_endereco_pkey;
       public            postgres    false    229    229            o           2606    212333 (   funcionario_login funcionario_login_pkey 
   CONSTRAINT     |   ALTER TABLE ONLY public.funcionario_login
    ADD CONSTRAINT funcionario_login_pkey PRIMARY KEY (funcionario_id, login_id);
 R   ALTER TABLE ONLY public.funcionario_login DROP CONSTRAINT funcionario_login_pkey;
       public            postgres    false    230    230            I           2606    212214    funcionario funcionario_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.funcionario
    ADD CONSTRAINT funcionario_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.funcionario DROP CONSTRAINT funcionario_pkey;
       public            postgres    false    211            [           2606    212280    login login_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.login
    ADD CONSTRAINT login_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.login DROP CONSTRAINT login_pkey;
       public            postgres    false    220            S           2606    212248    mensalidade mensalidade_pkey 
   CONSTRAINT     Z   ALTER TABLE ONLY public.mensalidade
    ADD CONSTRAINT mensalidade_pkey PRIMARY KEY (id);
 F   ALTER TABLE ONLY public.mensalidade DROP CONSTRAINT mensalidade_pkey;
       public            postgres    false    216            ]           2606    212288    partida partida_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.partida
    ADD CONSTRAINT partida_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.partida DROP CONSTRAINT partida_pkey;
       public            postgres    false    221            q           2606    212338 *   presidente_contato presidente_contato_pkey 
   CONSTRAINT        ALTER TABLE ONLY public.presidente_contato
    ADD CONSTRAINT presidente_contato_pkey PRIMARY KEY (presidente_id, contato_id);
 T   ALTER TABLE ONLY public.presidente_contato DROP CONSTRAINT presidente_contato_pkey;
       public            postgres    false    231    231            s           2606    212343 ,   presidente_endereco presidente_endereco_pkey 
   CONSTRAINT     �   ALTER TABLE ONLY public.presidente_endereco
    ADD CONSTRAINT presidente_endereco_pkey PRIMARY KEY (presidente_id, endereco_id);
 V   ALTER TABLE ONLY public.presidente_endereco DROP CONSTRAINT presidente_endereco_pkey;
       public            postgres    false    232    232            u           2606    212348 &   presidente_login presidente_login_pkey 
   CONSTRAINT     y   ALTER TABLE ONLY public.presidente_login
    ADD CONSTRAINT presidente_login_pkey PRIMARY KEY (presidente_id, login_id);
 P   ALTER TABLE ONLY public.presidente_login DROP CONSTRAINT presidente_login_pkey;
       public            postgres    false    233    233            K           2606    212222    presidente presidente_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.presidente
    ADD CONSTRAINT presidente_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.presidente DROP CONSTRAINT presidente_pkey;
       public            postgres    false    212            U           2606    212256    produto produto_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT produto_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.produto DROP CONSTRAINT produto_pkey;
       public            postgres    false    217            y           2606    212358    socio_conta socio_conta_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.socio_conta
    ADD CONSTRAINT socio_conta_pkey PRIMARY KEY (socio_id, conta_id);
 F   ALTER TABLE ONLY public.socio_conta DROP CONSTRAINT socio_conta_pkey;
       public            postgres    false    235    235            {           2606    212363     socio_contato socio_contato_pkey 
   CONSTRAINT     p   ALTER TABLE ONLY public.socio_contato
    ADD CONSTRAINT socio_contato_pkey PRIMARY KEY (socio_id, contato_id);
 J   ALTER TABLE ONLY public.socio_contato DROP CONSTRAINT socio_contato_pkey;
       public            postgres    false    236    236            }           2606    212368 "   socio_endereco socio_endereco_pkey 
   CONSTRAINT     s   ALTER TABLE ONLY public.socio_endereco
    ADD CONSTRAINT socio_endereco_pkey PRIMARY KEY (socio_id, endereco_id);
 L   ALTER TABLE ONLY public.socio_endereco DROP CONSTRAINT socio_endereco_pkey;
       public            postgres    false    237    237                       2606    212373    socio_login socio_login_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.socio_login
    ADD CONSTRAINT socio_login_pkey PRIMARY KEY (socio_id, login_id);
 F   ALTER TABLE ONLY public.socio_login DROP CONSTRAINT socio_login_pkey;
       public            postgres    false    238    238            �           2606    212378 (   socio_mensalidade socio_mensalidade_pkey 
   CONSTRAINT     |   ALTER TABLE ONLY public.socio_mensalidade
    ADD CONSTRAINT socio_mensalidade_pkey PRIMARY KEY (socio_id, mensalidade_id);
 R   ALTER TABLE ONLY public.socio_mensalidade DROP CONSTRAINT socio_mensalidade_pkey;
       public            postgres    false    239    239            O           2606    212238    socio socio_pkey 
   CONSTRAINT     N   ALTER TABLE ONLY public.socio
    ADD CONSTRAINT socio_pkey PRIMARY KEY (id);
 :   ALTER TABLE ONLY public.socio DROP CONSTRAINT socio_pkey;
       public            postgres    false    214            _           2606    212293    time_a time_a_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.time_a
    ADD CONSTRAINT time_a_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.time_a DROP CONSTRAINT time_a_pkey;
       public            postgres    false    222            �           2606    212388    time_a_socio time_a_socio_pkey 
   CONSTRAINT     x   ALTER TABLE ONLY public.time_a_socio
    ADD CONSTRAINT time_a_socio_pkey PRIMARY KEY (time_a_id, jogadoresdotimea_id);
 H   ALTER TABLE ONLY public.time_a_socio DROP CONSTRAINT time_a_socio_pkey;
       public            postgres    false    241    241            a           2606    212298    time_b time_b_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.time_b
    ADD CONSTRAINT time_b_pkey PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.time_b DROP CONSTRAINT time_b_pkey;
       public            postgres    false    223            �           2606    212393    time_b_socio time_b_socio_pkey 
   CONSTRAINT     w   ALTER TABLE ONLY public.time_b_socio
    ADD CONSTRAINT time_b_socio_pkey PRIMARY KEY (time_b_id, jogadoredotimeb_id);
 H   ALTER TABLE ONLY public.time_b_socio DROP CONSTRAINT time_b_socio_pkey;
       public            postgres    false    242    242            A           2606    198399    timea_socio timea_socio_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.timea_socio
    ADD CONSTRAINT timea_socio_pkey PRIMARY KEY (timea_id, socio_id);
 F   ALTER TABLE ONLY public.timea_socio DROP CONSTRAINT timea_socio_pkey;
       public            postgres    false    207    207            C           2606    198404    timeb_socio timeb_socio_pkey 
   CONSTRAINT     j   ALTER TABLE ONLY public.timeb_socio
    ADD CONSTRAINT timeb_socio_pkey PRIMARY KEY (timeb_id, socio_id);
 F   ALTER TABLE ONLY public.timeb_socio DROP CONSTRAINT timeb_socio_pkey;
       public            postgres    false    208    208            �           2620    212670    socio dataCadastro    TRIGGER     }   CREATE TRIGGER "dataCadastro" BEFORE INSERT OR UPDATE ON public.socio FOR EACH ROW EXECUTE FUNCTION public."dataCadastro"();
 -   DROP TRIGGER "dataCadastro" ON public.socio;
       public          postgres    false    258    214            �           2606    212454 ?   administrador_contato fk_administrador_contato_administrador_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_contato
    ADD CONSTRAINT fk_administrador_contato_administrador_id FOREIGN KEY (administrador_id) REFERENCES public.administrador(id);
 i   ALTER TABLE ONLY public.administrador_contato DROP CONSTRAINT fk_administrador_contato_administrador_id;
       public          postgres    false    224    209    2885            �           2606    212449 9   administrador_contato fk_administrador_contato_contato_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_contato
    ADD CONSTRAINT fk_administrador_contato_contato_id FOREIGN KEY (contato_id) REFERENCES public.contato(id);
 c   ALTER TABLE ONLY public.administrador_contato DROP CONSTRAINT fk_administrador_contato_contato_id;
       public          postgres    false    224    218    2903            �           2606    212464 A   administrador_endereco fk_administrador_endereco_administrador_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_endereco
    ADD CONSTRAINT fk_administrador_endereco_administrador_id FOREIGN KEY (administrador_id) REFERENCES public.administrador(id);
 k   ALTER TABLE ONLY public.administrador_endereco DROP CONSTRAINT fk_administrador_endereco_administrador_id;
       public          postgres    false    225    209    2885            �           2606    212459 <   administrador_endereco fk_administrador_endereco_endereco_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_endereco
    ADD CONSTRAINT fk_administrador_endereco_endereco_id FOREIGN KEY (endereco_id) REFERENCES public.endereco(id);
 f   ALTER TABLE ONLY public.administrador_endereco DROP CONSTRAINT fk_administrador_endereco_endereco_id;
       public          postgres    false    225    219    2905            �           2606    212469 ;   administrador_login fk_administrador_login_administrador_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_login
    ADD CONSTRAINT fk_administrador_login_administrador_id FOREIGN KEY (administrador_id) REFERENCES public.administrador(id);
 e   ALTER TABLE ONLY public.administrador_login DROP CONSTRAINT fk_administrador_login_administrador_id;
       public          postgres    false    226    209    2885            �           2606    212474 3   administrador_login fk_administrador_login_login_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.administrador_login
    ADD CONSTRAINT fk_administrador_login_login_id FOREIGN KEY (login_id) REFERENCES public.login(id);
 ]   ALTER TABLE ONLY public.administrador_login DROP CONSTRAINT fk_administrador_login_login_id;
       public          postgres    false    226    220    2907            �           2606    212484 !   bar_produto fk_bar_produto_bar_id    FK CONSTRAINT     }   ALTER TABLE ONLY public.bar_produto
    ADD CONSTRAINT fk_bar_produto_bar_id FOREIGN KEY (bar_id) REFERENCES public.bar(id);
 K   ALTER TABLE ONLY public.bar_produto DROP CONSTRAINT fk_bar_produto_bar_id;
       public          postgres    false    227    210    2887            �           2606    212479 %   bar_produto fk_bar_produto_produto_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.bar_produto
    ADD CONSTRAINT fk_bar_produto_produto_id FOREIGN KEY (produto_id) REFERENCES public.produto(id);
 O   ALTER TABLE ONLY public.bar_produto DROP CONSTRAINT fk_bar_produto_produto_id;
       public          postgres    false    227    217    2901            �           2606    212399    clube fk_clube_administrador_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.clube
    ADD CONSTRAINT fk_clube_administrador_id FOREIGN KEY (administrador_id) REFERENCES public.administrador(id);
 I   ALTER TABLE ONLY public.clube DROP CONSTRAINT fk_clube_administrador_id;
       public          postgres    false    2885    213    209            �           2606    212404    clube fk_clube_funcionario_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.clube
    ADD CONSTRAINT fk_clube_funcionario_id FOREIGN KEY (funcionario_id) REFERENCES public.funcionario(id);
 G   ALTER TABLE ONLY public.clube DROP CONSTRAINT fk_clube_funcionario_id;
       public          postgres    false    213    211    2889            �           2606    212394    clube fk_clube_presidente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.clube
    ADD CONSTRAINT fk_clube_presidente_id FOREIGN KEY (presidente_id) REFERENCES public.presidente(id);
 F   ALTER TABLE ONLY public.clube DROP CONSTRAINT fk_clube_presidente_id;
       public          postgres    false    2891    212    213            �           2606    212554 #   clube_socio fk_clube_socio_clube_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.clube_socio
    ADD CONSTRAINT fk_clube_socio_clube_id FOREIGN KEY (clube_id) REFERENCES public.clube(id);
 M   ALTER TABLE ONLY public.clube_socio DROP CONSTRAINT fk_clube_socio_clube_id;
       public          postgres    false    234    213    2893            �           2606    212549 #   clube_socio fk_clube_socio_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.clube_socio
    ADD CONSTRAINT fk_clube_socio_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 M   ALTER TABLE ONLY public.clube_socio DROP CONSTRAINT fk_clube_socio_socio_id;
       public          postgres    false    234    214    2895            �           2606    212614 *   conta_produto fk_conta_produto_consumos_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.conta_produto
    ADD CONSTRAINT fk_conta_produto_consumos_id FOREIGN KEY (consumos_id) REFERENCES public.produto(id);
 T   ALTER TABLE ONLY public.conta_produto DROP CONSTRAINT fk_conta_produto_consumos_id;
       public          postgres    false    217    240    2901            �           2606    212609 '   conta_produto fk_conta_produto_conta_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.conta_produto
    ADD CONSTRAINT fk_conta_produto_conta_id FOREIGN KEY (conta_id) REFERENCES public.conta(id);
 Q   ALTER TABLE ONLY public.conta_produto DROP CONSTRAINT fk_conta_produto_conta_id;
       public          postgres    false    215    240    2897            �           2606    212414    conta fk_conta_socio_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.conta
    ADD CONSTRAINT fk_conta_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 A   ALTER TABLE ONLY public.conta DROP CONSTRAINT fk_conta_socio_id;
       public          postgres    false    215    214    2895            �           2606    212489 5   funcionario_contato fk_funcionario_contato_contato_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_contato
    ADD CONSTRAINT fk_funcionario_contato_contato_id FOREIGN KEY (contato_id) REFERENCES public.contato(id);
 _   ALTER TABLE ONLY public.funcionario_contato DROP CONSTRAINT fk_funcionario_contato_contato_id;
       public          postgres    false    228    218    2903            �           2606    212494 9   funcionario_contato fk_funcionario_contato_funcionario_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_contato
    ADD CONSTRAINT fk_funcionario_contato_funcionario_id FOREIGN KEY (funcionario_id) REFERENCES public.funcionario(id);
 c   ALTER TABLE ONLY public.funcionario_contato DROP CONSTRAINT fk_funcionario_contato_funcionario_id;
       public          postgres    false    228    211    2889            �           2606    212499 8   funcionario_endereco fk_funcionario_endereco_endereco_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_endereco
    ADD CONSTRAINT fk_funcionario_endereco_endereco_id FOREIGN KEY (endereco_id) REFERENCES public.endereco(id);
 b   ALTER TABLE ONLY public.funcionario_endereco DROP CONSTRAINT fk_funcionario_endereco_endereco_id;
       public          postgres    false    229    219    2905            �           2606    212504 ;   funcionario_endereco fk_funcionario_endereco_funcionario_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_endereco
    ADD CONSTRAINT fk_funcionario_endereco_funcionario_id FOREIGN KEY (funcionario_id) REFERENCES public.funcionario(id);
 e   ALTER TABLE ONLY public.funcionario_endereco DROP CONSTRAINT fk_funcionario_endereco_funcionario_id;
       public          postgres    false    229    211    2889            �           2606    212509 5   funcionario_login fk_funcionario_login_funcionario_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_login
    ADD CONSTRAINT fk_funcionario_login_funcionario_id FOREIGN KEY (funcionario_id) REFERENCES public.funcionario(id);
 _   ALTER TABLE ONLY public.funcionario_login DROP CONSTRAINT fk_funcionario_login_funcionario_id;
       public          postgres    false    230    211    2889            �           2606    212514 /   funcionario_login fk_funcionario_login_login_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.funcionario_login
    ADD CONSTRAINT fk_funcionario_login_login_id FOREIGN KEY (login_id) REFERENCES public.login(id);
 Y   ALTER TABLE ONLY public.funcionario_login DROP CONSTRAINT fk_funcionario_login_login_id;
       public          postgres    false    230    220    2907            �           2606    212419 #   mensalidade fk_mensalidade_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.mensalidade
    ADD CONSTRAINT fk_mensalidade_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 M   ALTER TABLE ONLY public.mensalidade DROP CONSTRAINT fk_mensalidade_socio_id;
       public          postgres    false    216    214    2895            �           2606    212434    partida fk_partida_time_a_id    FK CONSTRAINT     ~   ALTER TABLE ONLY public.partida
    ADD CONSTRAINT fk_partida_time_a_id FOREIGN KEY (time_a_id) REFERENCES public.time_a(id);
 F   ALTER TABLE ONLY public.partida DROP CONSTRAINT fk_partida_time_a_id;
       public          postgres    false    2911    222    221            �           2606    212429    partida fk_partida_time_b_id    FK CONSTRAINT     ~   ALTER TABLE ONLY public.partida
    ADD CONSTRAINT fk_partida_time_b_id FOREIGN KEY (time_b_id) REFERENCES public.time_b(id);
 F   ALTER TABLE ONLY public.partida DROP CONSTRAINT fk_partida_time_b_id;
       public          postgres    false    2913    221    223            �           2606    212524 3   presidente_contato fk_presidente_contato_contato_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_contato
    ADD CONSTRAINT fk_presidente_contato_contato_id FOREIGN KEY (contato_id) REFERENCES public.contato(id);
 ]   ALTER TABLE ONLY public.presidente_contato DROP CONSTRAINT fk_presidente_contato_contato_id;
       public          postgres    false    231    218    2903            �           2606    212519 6   presidente_contato fk_presidente_contato_presidente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_contato
    ADD CONSTRAINT fk_presidente_contato_presidente_id FOREIGN KEY (presidente_id) REFERENCES public.presidente(id);
 `   ALTER TABLE ONLY public.presidente_contato DROP CONSTRAINT fk_presidente_contato_presidente_id;
       public          postgres    false    231    212    2891            �           2606    212529 6   presidente_endereco fk_presidente_endereco_endereco_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_endereco
    ADD CONSTRAINT fk_presidente_endereco_endereco_id FOREIGN KEY (endereco_id) REFERENCES public.endereco(id);
 `   ALTER TABLE ONLY public.presidente_endereco DROP CONSTRAINT fk_presidente_endereco_endereco_id;
       public          postgres    false    232    219    2905            �           2606    212534 8   presidente_endereco fk_presidente_endereco_presidente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_endereco
    ADD CONSTRAINT fk_presidente_endereco_presidente_id FOREIGN KEY (presidente_id) REFERENCES public.presidente(id);
 b   ALTER TABLE ONLY public.presidente_endereco DROP CONSTRAINT fk_presidente_endereco_presidente_id;
       public          postgres    false    232    212    2891            �           2606    212539 -   presidente_login fk_presidente_login_login_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_login
    ADD CONSTRAINT fk_presidente_login_login_id FOREIGN KEY (login_id) REFERENCES public.login(id);
 W   ALTER TABLE ONLY public.presidente_login DROP CONSTRAINT fk_presidente_login_login_id;
       public          postgres    false    233    220    2907            �           2606    212544 2   presidente_login fk_presidente_login_presidente_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.presidente_login
    ADD CONSTRAINT fk_presidente_login_presidente_id FOREIGN KEY (presidente_id) REFERENCES public.presidente(id);
 \   ALTER TABLE ONLY public.presidente_login DROP CONSTRAINT fk_presidente_login_presidente_id;
       public          postgres    false    233    212    2891            �           2606    212424    produto fk_produto_bar_id    FK CONSTRAINT     u   ALTER TABLE ONLY public.produto
    ADD CONSTRAINT fk_produto_bar_id FOREIGN KEY (bar_id) REFERENCES public.bar(id);
 C   ALTER TABLE ONLY public.produto DROP CONSTRAINT fk_produto_bar_id;
       public          postgres    false    217    210    2887            �           2606    212409    socio fk_socio_clube_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.socio
    ADD CONSTRAINT fk_socio_clube_id FOREIGN KEY (clube_id) REFERENCES public.clube(id);
 A   ALTER TABLE ONLY public.socio DROP CONSTRAINT fk_socio_clube_id;
       public          postgres    false    213    214    2893            �           2606    212559 #   socio_conta fk_socio_conta_conta_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_conta
    ADD CONSTRAINT fk_socio_conta_conta_id FOREIGN KEY (conta_id) REFERENCES public.conta(id);
 M   ALTER TABLE ONLY public.socio_conta DROP CONSTRAINT fk_socio_conta_conta_id;
       public          postgres    false    235    215    2897            �           2606    212564 #   socio_conta fk_socio_conta_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_conta
    ADD CONSTRAINT fk_socio_conta_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 M   ALTER TABLE ONLY public.socio_conta DROP CONSTRAINT fk_socio_conta_socio_id;
       public          postgres    false    235    214    2895            �           2606    212574 )   socio_contato fk_socio_contato_contato_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_contato
    ADD CONSTRAINT fk_socio_contato_contato_id FOREIGN KEY (contato_id) REFERENCES public.contato(id);
 S   ALTER TABLE ONLY public.socio_contato DROP CONSTRAINT fk_socio_contato_contato_id;
       public          postgres    false    236    218    2903            �           2606    212569 '   socio_contato fk_socio_contato_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_contato
    ADD CONSTRAINT fk_socio_contato_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 Q   ALTER TABLE ONLY public.socio_contato DROP CONSTRAINT fk_socio_contato_socio_id;
       public          postgres    false    236    214    2895            �           2606    212579 ,   socio_endereco fk_socio_endereco_endereco_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_endereco
    ADD CONSTRAINT fk_socio_endereco_endereco_id FOREIGN KEY (endereco_id) REFERENCES public.endereco(id);
 V   ALTER TABLE ONLY public.socio_endereco DROP CONSTRAINT fk_socio_endereco_endereco_id;
       public          postgres    false    237    219    2905            �           2606    212584 )   socio_endereco fk_socio_endereco_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_endereco
    ADD CONSTRAINT fk_socio_endereco_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 S   ALTER TABLE ONLY public.socio_endereco DROP CONSTRAINT fk_socio_endereco_socio_id;
       public          postgres    false    2895    237    214            �           2606    212589 #   socio_login fk_socio_login_login_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_login
    ADD CONSTRAINT fk_socio_login_login_id FOREIGN KEY (login_id) REFERENCES public.login(id);
 M   ALTER TABLE ONLY public.socio_login DROP CONSTRAINT fk_socio_login_login_id;
       public          postgres    false    2907    220    238            �           2606    212594 #   socio_login fk_socio_login_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_login
    ADD CONSTRAINT fk_socio_login_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 M   ALTER TABLE ONLY public.socio_login DROP CONSTRAINT fk_socio_login_socio_id;
       public          postgres    false    2895    214    238            �           2606    212604 5   socio_mensalidade fk_socio_mensalidade_mensalidade_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_mensalidade
    ADD CONSTRAINT fk_socio_mensalidade_mensalidade_id FOREIGN KEY (mensalidade_id) REFERENCES public.mensalidade(id);
 _   ALTER TABLE ONLY public.socio_mensalidade DROP CONSTRAINT fk_socio_mensalidade_mensalidade_id;
       public          postgres    false    239    2899    216            �           2606    212599 /   socio_mensalidade fk_socio_mensalidade_socio_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.socio_mensalidade
    ADD CONSTRAINT fk_socio_mensalidade_socio_id FOREIGN KEY (socio_id) REFERENCES public.socio(id);
 Y   ALTER TABLE ONLY public.socio_mensalidade DROP CONSTRAINT fk_socio_mensalidade_socio_id;
       public          postgres    false    2895    239    214            �           2606    212439    time_a fk_time_a_partida_id    FK CONSTRAINT        ALTER TABLE ONLY public.time_a
    ADD CONSTRAINT fk_time_a_partida_id FOREIGN KEY (partida_id) REFERENCES public.partida(id);
 E   ALTER TABLE ONLY public.time_a DROP CONSTRAINT fk_time_a_partida_id;
       public          postgres    false    222    221    2909            �           2606    212624 0   time_a_socio fk_time_a_socio_jogadoresdotimea_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.time_a_socio
    ADD CONSTRAINT fk_time_a_socio_jogadoresdotimea_id FOREIGN KEY (jogadoresdotimea_id) REFERENCES public.socio(id);
 Z   ALTER TABLE ONLY public.time_a_socio DROP CONSTRAINT fk_time_a_socio_jogadoresdotimea_id;
       public          postgres    false    2895    241    214            �           2606    212619 &   time_a_socio fk_time_a_socio_time_a_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.time_a_socio
    ADD CONSTRAINT fk_time_a_socio_time_a_id FOREIGN KEY (time_a_id) REFERENCES public.time_a(id);
 P   ALTER TABLE ONLY public.time_a_socio DROP CONSTRAINT fk_time_a_socio_time_a_id;
       public          postgres    false    2911    222    241            �           2606    212444    time_b fk_time_b_partida_id    FK CONSTRAINT        ALTER TABLE ONLY public.time_b
    ADD CONSTRAINT fk_time_b_partida_id FOREIGN KEY (partida_id) REFERENCES public.partida(id);
 E   ALTER TABLE ONLY public.time_b DROP CONSTRAINT fk_time_b_partida_id;
       public          postgres    false    223    221    2909            �           2606    212629 /   time_b_socio fk_time_b_socio_jogadoredotimeb_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.time_b_socio
    ADD CONSTRAINT fk_time_b_socio_jogadoredotimeb_id FOREIGN KEY (jogadoredotimeb_id) REFERENCES public.socio(id);
 Y   ALTER TABLE ONLY public.time_b_socio DROP CONSTRAINT fk_time_b_socio_jogadoredotimeb_id;
       public          postgres    false    214    242    2895            �           2606    212634 &   time_b_socio fk_time_b_socio_time_b_id    FK CONSTRAINT     �   ALTER TABLE ONLY public.time_b_socio
    ADD CONSTRAINT fk_time_b_socio_time_b_id FOREIGN KEY (time_b_id) REFERENCES public.time_b(id);
 P   ALTER TABLE ONLY public.time_b_socio DROP CONSTRAINT fk_time_b_socio_time_b_id;
       public          postgres    false    2913    242    223            ?   6   x�3�400Ѓb]NCKs]C#]#CNǜԊļ��T�Ҽ��"N#�=... %�      N      x�3�4����� ]      O      x�3�4����� ]      P      x�3�4����� ]      @      x�3����� Z �      Q      x�3�44����� 'P      C   z   x��K
�0 �ur�9����o�$��$�U7%�
�_��z�h��3ͷI!�զ5�v�Xkq�FE�t�	$ґ��cH���t*煉�Β.Q��.�Y��k�k/��ir-z0Z�/M�      X      x�3�4�2�4bc 6bS 6����� 4zv      E   4   x�%�A  ���B�.P���7��=�V�.��d|��������6�;�	�      ^      x�3�4�2�4bc 6�2�44������ *�)      H   �   x������ E��W��-h(-��?�|���tT�_L��<��n��93�9�h��>]����܌����?�;'Qt�Z���i�9~�5
�|ˆ���v1�>TZ#�1
9 �SzvZ
�z�A�K%NaY����7�뙞 ۻ� Jd����X�V#B���Z��j�C�+�B��J���J����J��� �[	x�      I     x���AN�0��}��@#ۍ�v���*+6�x
���p�\��p1�J�,�Z��?�Fԟ�%V��RJ�ᑂ#�Nӭ���p�82�S����,�Z<<�J��Nw��҈�ftԃ#xj�H>����7<z(���5j��,�VQ�q{���J-��P�iƵy��lws�l��2�o~���n�\���ژ:Q�J}�*6���;��fF����C�_',��X�eLŁߪ��K�ch��l
<24��t�-���f����A�j�G�*t�˗DJ�mӝ;      A   6   x�3�400Ѓb]NCKs]c]#CN����+�3sK�R�9-@�\1z\\\ E2c      R      x�3�4����� �#      S      x�3�4����� �#      T      x�3�4����� d      J   U  x�-�M��0���*��8N���]B0eb;6�Vj�}b;Y��Ap�����p���֏���U=�0��^��.&�
�r��k�Lf�9.�A���Kkܥc
��z�=��������@�.�KLl*M�,9�9yHS�#��ߏ��=�ॳT��d��ToZ3ZR)�F\�>��zY��v>�=�9Xj�9� 2	.�%.�AA����W󶉝�c���v�䔁[�ν";HO]HZ�e@0���?��8O56E�e�d�#�-B����4Vm���~�|��q�
��<<��bi�,S���i��c�m~o׵������jL5�d�T���˛i�� u3�Z      F   @   x�3�4����54�52�t���45�4�2�*n�e���s���M�LQ��\f(|3�=... -J?      K   *   x�3�4202�50�54�4����4��26�4�4����� q      B   =   x�3�444ԃb]CCNCK3]C]CN����+������s��JR9��b���� ���      U      x�3�4����� k       V      x�3�4����� k       W      x�3�4����� k       G   �   x�U�M�0�ׯ�������cLܲ)?1��$�(�[��Ŝ"�]��͛8_����T�-T %B�l�����+l�^�|����f!��,R��tCIv+�{Ӛ���,4����p�x���d;�)5��x̫I<;�[**Oǰ���@�Q���u0~�=I�ߺ�M�B| q)E�      D   �   x�m�MN�0F��)r�X���8��a��v6�����Ji��p.F:S�,>ɲ��>�!"��iRG�XL�r>MϳAC�x�� "�i;���ߐ7�H|�oXvx�z����0�7'#���H,i�PBՔ�8���4+�7ѵ��y��xg����R�2-�����,��#p{Su{39�k��i��l�:,�\L�B�\�@�
o�xS��!M�uWݍ�y����,�S,�%(���Z�]�}5PR      Y   %   x�3�4�2�4�2�4�2�4�2�4�2�4����� 5Q�      Z   )   x�3�4�2�4�2�45�2�440�2�4��8���=... Yd�      [   )   x�3�4�2�4�2�45�2�440�2�4��8���=... Yd�      \   )   x�3�4�2�4�2�45�2�440�2�4��8���=... Yd�      ]   %   x�3�4�2�4�2�4�2�4�2�4�2�4����� 5Q�      L      x�3�4�4����� �Y      _      x�3�4����� ]      M      x�3�4�4����� �X      `      x�3�4����� d      =      x�3�4����� k       >      x�3�4����� r!     