

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.userLookup.userDomainClassName = 'tpmbds.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'tpmbds.UserRole'
grails.plugin.springsecurity.authority.className = 'tpmbds.Role'
grails.plugin.springsecurity.logout.postOnly=false
grails.plugin.springsecurity.securityConfigType = "Annotation"
grails.plugin.springsecurity.controllerAnnotations.staticRules = [
	[pattern: '/**',               access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/error',          access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/index',          access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/index.gsp',      access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/shutdown',       access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/assets/**',      access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/**/js/**',       access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/**/css/**',      access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/**/images/**',   access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/**/favicon.ico', access: ['ROLE_ADMIN','ROLE_MODERATOR']],
	[pattern: '/api/**', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
	[pattern: '/assets/**',      filters: 'none'],
	[pattern: '/**/js/**',       filters: 'none'],
	[pattern: '/**/css/**',      filters: 'none'],
	[pattern: '/**/images/**',   filters: 'none'],
	[pattern: '/**/favicon.ico', filters: 'none'],
	[pattern: '/**',             filters: 'JOINED_FILTERS']
]

