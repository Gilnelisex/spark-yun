alter table SY_WORK_CONFIG
    add RETRY_RULE varchar(500);
comment on column SY_WORK_CONFIG.RETRY_RULE is '自动重试规则';