package com.domrock.validadores;

import java.util.regex.Pattern;

public class RegexValidators {
    public static final Pattern NOME_REGEX = Pattern.compile("[a-zA-z]");
    public static final Pattern SENHA_REGEX = Pattern.compile("^(?=.*[A-Za-z])(?=.*[0-9]).{8,15}$");
    public static final Pattern CONTATO_REGEX = Pattern.compile("^\\+[1-9][0-9]\\d{10,14}$");
    public static final Pattern CPF_REGEX = Pattern.compile("^[0-9]{11}$");
    public static final Pattern EMAIL_REGEX = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$");
    public static final Pattern VALID_STRING_REGEX = Pattern.compile("^[ A-Za-z0-9./#&+-]*$");
    public static final Pattern VALID_MONTH_REGEX = Pattern.compile("[1-9]|1[0-2]");
}